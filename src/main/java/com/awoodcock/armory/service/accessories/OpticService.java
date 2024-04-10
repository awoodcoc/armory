package com.awoodcock.armory.service.accessories;

import com.awoodcock.armory.data.accessories.OpticRepository;
import com.awoodcock.armory.models.accessories.Optic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpticService {

    // REPOSITORY
    private final OpticRepository opticRepository;

    // CONSTRUCTOR
    @Autowired
    public OpticService (OpticRepository opticRepository) {
        this.opticRepository = opticRepository;
    }

    // CRUD OPERATIONS for OPTIC class

    // CREATE
    public Optic addOptic (Optic optic) {
        return opticRepository.save(optic);
    }

    // READ
    public Optional<Optic> getOpticById(int id) {
        return opticRepository.findById(id);
    }

    public List<Optic> getAllOptics() {return opticRepository.findAll();}

    // UPDATE

    // DELETE
    public void deleteOptic(int id) {opticRepository.deleteById(id);}
}
