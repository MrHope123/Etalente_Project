package com.enviro.assessment.grad001.fulufhelomaluleke.Service;


import com.enviro.assessment.grad001.fulufhelomaluleke.Model.RecyclingTip;
import com.enviro.assessment.grad001.fulufhelomaluleke.Repository.RecyclingTipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecyclingTipService {
    @Autowired
    private RecyclingTipRepository repository;

    // Fetch all recycling tips
    public List<RecyclingTip> getAllTips() {
        return repository.findAll();
    }

    // Save a new recycling tip
    public RecyclingTip saveTip(RecyclingTip tip) {
        return repository.save(tip);
    }

    // Fetch a recycling tip by ID
    public Optional<RecyclingTip> getTipById(Long id) {
        return repository.findById(id);
    }

    // Delete a recycling tip
    public void deleteTip(Long id) {
        repository.deleteById(id);
    }
}
