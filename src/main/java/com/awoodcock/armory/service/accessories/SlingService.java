package com.awoodcock.armory.service.accessories;

import com.awoodcock.armory.data.accessories.SlingRepository;
import com.awoodcock.armory.models.accessories.Sling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SlingService {

    // REPOSITORY
    private final SlingRepository slingRepository;

    // CONSTRUCTOR
    @Autowired
    public SlingService (SlingRepository slingRepository) {
        this.slingRepository = slingRepository;
    }

    // CRUD OPERATIONS for SLING class

    // CREATE
    public Sling addSling (Sling sling) {
        return slingRepository.save(sling);
    }

    // READ
    public Sling getSlingById(int id) {
        Optional<Sling> sling = slingRepository.findById(id);
        return sling.orElse(null);
    }

    public List<Sling> getAllSlings() {
        return slingRepository.findAll();
    }

    // UPDATE
    public Sling updateSlingById(int id, Sling sling) {
        Optional<Sling> slingOptional = slingRepository.findById(id);

        if (slingOptional.isPresent()) {
            Sling originalSling = slingOptional.get();

            // name
            if (Objects.nonNull(sling.getName()) && !"".equalsIgnoreCase(sling.getName())) {
                originalSling.setName(sling.getName());
            }

            // description
            if (Objects.nonNull(sling.getDescription()) && !"".equalsIgnoreCase(sling.getName())) {
                originalSling.setDescription(sling.getDescription());
            }

            // price
            if (Objects.nonNull(sling.getPrice()) && sling.getPrice() != 0) {
                originalSling.setPrice(sling.getPrice());
            }

            // weight
            if (Objects.nonNull(sling.getWeight()) && sling.getWeight() != 0) {
                originalSling.setWeight(sling.getWeight());
            }

            // numPoints
            if (Objects.nonNull(sling.getNumPoints()) && sling.getNumPoints() != 0) {
                originalSling.setNumPoints((sling.getNumPoints()));
            }

            // attachmentMethod
            if (Objects.nonNull(sling.getDescription()) && !"".equalsIgnoreCase(sling.getName())) {
                originalSling.setDescription(sling.getDescription());
            }

            return slingRepository.save(originalSling);
        }
        return null;
    }

    // DELETE
    public String deleteSling(int id) {
        if (slingRepository.findById(id).isPresent()) {
            slingRepository.deleteById(id);
            return "Sling successfully deleted.";
        }
        return "Sling not found within database.";
    }

}
