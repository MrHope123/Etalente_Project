package com.enviro.assessment.grad001.fulufhelomaluleke.Controller;


import com.enviro.assessment.grad001.fulufhelomaluleke.Exception.ResourceNotFoundException;
import com.enviro.assessment.grad001.fulufhelomaluleke.Model.WasteCategory;
import com.enviro.assessment.grad001.fulufhelomaluleke.Repository.WasteCategoryRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class WasteCategoryController {
    @Autowired
    private WasteCategoryRepository repository;

    @GetMapping
    public List<WasteCategory> getAllCategories() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WasteCategory> getCategoryById(@PathVariable Long id) {
        WasteCategory category = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Waste category not found for id: " + id));
        return ResponseEntity.ok(category);
    }

    @PostMapping
    public ResponseEntity<WasteCategory> createCategory(@Valid @RequestBody WasteCategory category) {
        return ResponseEntity.ok(repository.save(category));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Category not found for deletion: " + id);
        }
        repository.deleteById(id);
        return ResponseEntity.ok("Category deleted successfully");
    }
}
