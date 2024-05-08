package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.BarrelRepository;
import com.awoodcock.armory.models.ar.Barrel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarrelService {

    // REPOSITORY
    private final BarrelRepository barrelRepository;

    // CONSTRUCTOR
    @Autowired
    public BarrelService (BarrelRepository barrelRepository) {
        this.barrelRepository = barrelRepository;
    }

    // CRUD OPERATIONS for BARREL class

    // CREATE
    public Barrel addBarrel (Barrel barrel) {
        return barrelRepository.save(barrel);
    }

    // READ
    public Optional<Barrel> getBarrelById (int id) {
        return barrelRepository.findById(id);
    }

    public List<Barrel> getAllBarrels() {
        return barrelRepository.findAll();
    }

    // UPDATE

    // DELETE
    public void deleteBarrel(int id) {
        barrelRepository.deleteById(id);
    }
}
