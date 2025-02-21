package com.enviro.assessment.grad001.fulufhelomaluleke.Controller;

import com.enviro.assessment.grad001.fulufhelomaluleke.Exception.ResourceNotFoundException;
import com.enviro.assessment.grad001.fulufhelomaluleke.Model.DisposalGuideline;
import com.enviro.assessment.grad001.fulufhelomaluleke.Repository.DisposalGuidelineRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Marks this class as a REST controller
@RestController
// Maps requests to /api/guidelines
@RequestMapping("/api/guidelines")
public class DisposalGuidelineController {
    @Autowired
    private DisposalGuidelineRepository repository;

    // Handles GET requests to /api/guidelines
    @GetMapping
    public List<DisposalGuideline> getAllGuidelines() {
        return repository.findAll();
    }

    // Handles GET requests to /api/guidelines/{id}
    @GetMapping("/{id}")
    public ResponseEntity<DisposalGuideline> getGuidelineById(@PathVariable Long id) {
        // Finds a guideline by its ID
        DisposalGuideline guideline = repository.findById(id)
                // Throws exception if not found
                .orElseThrow(() -> new ResourceNotFoundException("Disposal guideline not found for id: " + id));
        return ResponseEntity.ok(guideline); // Returns the found guideline with a 200 OK status
    }

    // Handles POST requests to /api/guidelines
    @PostMapping
    public ResponseEntity<DisposalGuideline> createGuideline(@Valid @RequestBody DisposalGuideline guideline) {
        // Saves the new guideline
        DisposalGuideline savedGuideline = repository.save(guideline);
        // Returns the saved guideline with a 200 OK status
        return ResponseEntity.ok(savedGuideline);
    }

    // Handles DELETE requests to /api/guidelines/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        // Checks if the guideline exists
        if (!repository.existsById(id)) {
            // Throws exception if not found
            throw new ResourceNotFoundException("Disposal guideline not found for deletion: " + id);
        }
        // Deletes the guideline
        repository.deleteById(id);
        // Returns a success message
        return ResponseEntity.ok("Disposal guideline deleted successfully");
    }
}