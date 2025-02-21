package com.enviro.assessment.grad001.fulufhelomaluleke.Service;

import com.enviro.assessment.grad001.fulufhelomaluleke.Model.DisposalGuideline;
import com.enviro.assessment.grad001.fulufhelomaluleke.Repository.DisposalGuidelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// This annotation makes the class a Spring-managed bean
@Service
public class DisposalGuidelineService {
    // Inject the DisposalGuidelineRepository
    @Autowired
    // Repository for database operations
    private DisposalGuidelineRepository repository;

    public List<DisposalGuideline> getAllGuidelines() {
        // Retrieve all disposal guidelines from the database
        return repository.findAll();
    }

    public DisposalGuideline saveGuideline(DisposalGuideline guideline) {
        // Save a new disposal guideline to the database
        return repository.save(guideline);
    }

    public Optional<DisposalGuideline> getGuidelineById(Long id) {
        // Retrieve a disposal guideline by its ID
        return repository.findById(id);
    }

    public void deleteGuideline(Long id) {
        // Delete a disposal guideline by its ID
        repository.deleteById(id);
    }
}