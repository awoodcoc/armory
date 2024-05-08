package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.PistolGripRepository;
import com.awoodcock.armory.models.ar.PistolGrip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PistolGripService {

    // REPOSITORY
    private final PistolGripRepository pistolGripRepository;

    // CONSTRUCTOR
    @Autowired
    public PistolGripService (PistolGripRepository pistolGripRepository) {
        this.pistolGripRepository = pistolGripRepository;
    }

    // CRUD OPERATIONS for PistolGrip class

    // CREATE
    public PistolGrip addPistolGrip (PistolGrip pistolGrip) {
        return pistolGripRepository.save(pistolGrip);
    }

    // READ
    public Optional<PistolGrip> getPistolGripById (int id) {
        return pistolGripRepository.findById(id);
    }

    public List<PistolGrip> getAllPistolGrips () {
        return pistolGripRepository.findAll();
    }

    // UPDATE

    // DELETE
    public void deletePistolGrip (int id) {
        pistolGripRepository.deleteById(id);
    }
}
