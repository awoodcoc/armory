package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.HandguardRepository;
import com.awoodcock.armory.models.ar.Handguard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HandguardService {

    // REPOSITORY
    private final HandguardRepository handguardRepository;

    // CONSTRUCTOR
    @Autowired
    public HandguardService (HandguardRepository handguardRepository) {
        this.handguardRepository = handguardRepository;
    }

    // CRUD OPERATIONS for Handguard class

    // CREATE
    public Handguard addHandguard(Handguard handguard) {
        return handguardRepository.save(handguard);
    }

    // READ
    public Optional<Handguard> getHandguardById (int id) {
        return handguardRepository.findById(id);
    }

    public List<Handguard> getAllHandguards () {
        return handguardRepository.findAll();
    }

    // UPDATE

    // DELETE
    public void deleteHandguard(int id) {
        handguardRepository.deleteById(id);
    }
}
