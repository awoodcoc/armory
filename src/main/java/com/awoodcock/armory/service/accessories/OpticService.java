package com.awoodcock.armory.service.accessories;

import com.awoodcock.armory.data.accessories.OpticRepository;
import com.awoodcock.armory.models.accessories.Optic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
    public Optic getOpticById(int id) {
        Optional<Optic> optic = opticRepository.findById(id);
        return optic.orElse(null);
    }

    public List<Optic> getAllOptics() {return opticRepository.findAll();}

    // UPDATE
    public Optic updateOpticById(int id, Optic optic) {
        Optional<Optic> opticOptional = opticRepository.findById(id);

        if (opticOptional.isPresent()) {
            Optic originalOptic = opticOptional.get();

            // name
            if (Objects.nonNull(optic.getName()) && !"".equalsIgnoreCase(optic.getName())) {
                originalOptic.setName(optic.getName());
            }

            // description
            if (Objects.nonNull(optic.getDescription()) && !"".equalsIgnoreCase(optic.getName())) {
                originalOptic.setDescription(optic.getDescription());
            }

            // price
            if (Objects.nonNull(optic.getPrice()) && optic.getPrice() != 0) {
                originalOptic.setPrice(optic.getPrice());
            }

            // weight
            if (Objects.nonNull(optic.getWeight()) && optic.getWeight() != 0) {
                originalOptic.setWeight(optic.getWeight());
            }

            // classification
            if (Objects.nonNull(optic.getClassification()) && !"".equalsIgnoreCase(optic.getClassification())) {
                originalOptic.setClassification(optic.getClassification());
            }
            // magnification
            if (Objects.nonNull(optic.getMagnification()) && optic.getMagnification() != 0) {
                originalOptic.setMagnification(optic.getMagnification());
            }

            return opticRepository.save(originalOptic);
        }
        return null;
    }

    // DELETE
    public String deleteOptic(int id) {
        if (opticRepository.findById(id).isPresent()) {
            opticRepository.deleteById(id);
            return "Optic successfully deleted.";
        }
        return "Optic not found in database.";
    }
}
