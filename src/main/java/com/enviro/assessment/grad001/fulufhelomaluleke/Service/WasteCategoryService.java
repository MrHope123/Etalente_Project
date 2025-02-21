package com.enviro.assessment.grad001.fulufhelomaluleke.Service;

import com.enviro.assessment.grad001.fulufhelomaluleke.Model.WasteCategory;
import com.enviro.assessment.grad001.fulufhelomaluleke.Repository.WasteCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired; // For dependency injection
import org.springframework.stereotype.Service; // Marks this class as a service component
import java.util.List;

// This annotation makes the class a Spring-managed bean
@Service
public class WasteCategoryService {
    // Inject the WasteCategoryRepository
    @Autowired
    private WasteCategoryRepository repository; // Repository for database operations

    public List<WasteCategory> getAllCategories() {
        // Retrieve all waste categories from the database
        return repository.findAll();
    }

    public WasteCategory saveCategory(WasteCategory category) {
        // Save a new waste category to the database
        return repository.save(category);
    }
}