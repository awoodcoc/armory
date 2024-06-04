package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.HandguardRepository;
import com.awoodcock.armory.models.ar.Handguard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
    public Handguard getHandguardById (int id) {
        Optional<Handguard> handguard = handguardRepository.findById(id);
        return handguard.orElse(null);
    }

    public List<Handguard> getAllHandguards () {
        return handguardRepository.findAll();
    }

    // UPDATE
    public Handguard updateHandguardById (int id, Handguard handguard) {
        Optional<Handguard> handguardOptional = handguardRepository.findById(id);

        if (handguardOptional.isPresent()) {
            Handguard originalHandguard = handguardOptional.get();

            // name
            if (Objects.nonNull(handguard.getName()) && !"".equalsIgnoreCase(handguard.getName())) {
                originalHandguard.setName(handguard.getName());
            }

            // description
            if (Objects.nonNull(handguard.getDescription()) && !"".equalsIgnoreCase(handguard.getName())) {
                originalHandguard.setDescription(handguard.getDescription());
            }

            // price
            if (Objects.nonNull(handguard.getPrice()) && handguard.getPrice() != 0) {
                originalHandguard.setPrice(handguard.getPrice());
            }

            // weight
            if (Objects.nonNull(handguard.getWeight()) && handguard.getWeight() != 0) {
                originalHandguard.setWeight(handguard.getWeight());
            }

            // mountingSystem
            if (Objects.nonNull(handguard.getMountingSystem()) && !"".equalsIgnoreCase(handguard.getMountingSystem())) {
                originalHandguard.setMountingSystem(handguard.getMountingSystem());
            }

            // isFreeFloat
            if (Objects.nonNull(handguard.isFreeFloat())) {
                originalHandguard.setFreeFloat(handguard.isFreeFloat());
            }

            return handguardRepository.save(originalHandguard);
        }
        return null;
    }

    // DELETE
    public String deleteHandguard(int id) {
        if (handguardRepository.findById(id).isPresent()) {
            handguardRepository.deleteById(id);
            return "Handguard successfully deleted.";
        }
        return "Handguard not found in database.";
    }
}
