package com.enviro.assessment.grad001.fulufhelomaluleke.Model;

import jakarta.persistence.*; // Import for JPA annotations
import jakarta.validation.constraints.NotBlank; // Import for validation constraints
import lombok.Data; // Import for Lombok's @Data annotation

// Marks this class as a JPA entity
@Entity
// Lombok annotation to generate getters, setters, equals, hashCode, and toString methods
@Data
public class WasteCategory {
    // Marks this field as the primary key
    @Id
    // Configures auto-generation of primary key values
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Unique identifier for the waste category
    private Long id;

    // Validation constraint: name cannot be blank
    @NotBlank(message = "Category name is required")

    // Name of the waste category
    private String name;

    // Description of the waste category
    private String description;
}