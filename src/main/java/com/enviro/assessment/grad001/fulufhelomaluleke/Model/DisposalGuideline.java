package com.enviro.assessment.grad001.fulufhelomaluleke.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class DisposalGuideline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Waste type is required")
    private String wasteType;

    @NotBlank(message = "Disposal method is required")
    private String disposalMethod;

    @NotBlank(message = "Description is required")
    private String description;

}