package com.awoodcock.armory.service.accessories;

import com.awoodcock.armory.data.accessories.SlingRepository;
import com.awoodcock.armory.models.accessories.Sling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public Optional<Sling> getSlingById(int id) {
        return slingRepository.findById(id);
    }

    public List<Sling> getAllSlings() {
        return slingRepository.findAll();
    }

    // UPDATE

    // DELETE
    public void deleteSling(int id) {
        slingRepository.deleteById(id);
    }

}
