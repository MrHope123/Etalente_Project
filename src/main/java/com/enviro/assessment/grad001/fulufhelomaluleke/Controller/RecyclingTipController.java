package com.enviro.assessment.grad001.fulufhelomaluleke.Controller;

import com.enviro.assessment.grad001.fulufhelomaluleke.Exception.ResourceNotFoundException;
import com.enviro.assessment.grad001.fulufhelomaluleke.Model.RecyclingTip;
import com.enviro.assessment.grad001.fulufhelomaluleke.Repository.RecyclingTipRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/tips")
public class RecyclingTipController {
    @Autowired
    private RecyclingTipRepository repository;

    @GetMapping
    public List<RecyclingTip> getAllTips() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecyclingTip> getTipById(@PathVariable Long id) {
        RecyclingTip tip = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recycling tip not found for id: " + id));
        return ResponseEntity.ok(tip);
    }

    @PostMapping
    public ResponseEntity<RecyclingTip> createTip(@Valid @RequestBody RecyclingTip tip) {
        return ResponseEntity.ok(repository.save(tip));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTip(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Recycling tip not found for deletion: " + id);
        }
        repository.deleteById(id);
        return ResponseEntity.ok("Recycling tip deleted successfully");
    }
}