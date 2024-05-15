package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.PistolGripRepository;
import com.awoodcock.armory.models.ar.PistolGrip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
    public PistolGrip getPistolGripById (int id) {
        Optional<PistolGrip> pistolGrip = pistolGripRepository.findById(id);
        return pistolGrip.orElse(null);
    }

    public List<PistolGrip> getAllPistolGrips () {
        return pistolGripRepository.findAll();
    }

    // UPDATE
    public PistolGrip updatePistolGripById(int id, PistolGrip pistolGrip) {
        Optional<PistolGrip> pistolGripOptional = pistolGripRepository.findById(id);

        if (pistolGripOptional.isPresent()) {
            PistolGrip originalPistolGrip = pistolGripOptional.get();

            // name
            if (Objects.nonNull(pistolGrip.getName()) && !"".equalsIgnoreCase(pistolGrip.getName())) {
                originalPistolGrip.setName(pistolGrip.getName());
            }

            // description
            if (Objects.nonNull(pistolGrip.getDescription()) && !"".equalsIgnoreCase(pistolGrip.getName())) {
                originalPistolGrip.setDescription(pistolGrip.getDescription());
            }

            // price
            if (Objects.nonNull(pistolGrip.getPrice()) && pistolGrip.getPrice() != 0) {
                originalPistolGrip.setPrice(pistolGrip.getPrice());
            }

            // weight
            if (Objects.nonNull(pistolGrip.getWeight()) && pistolGrip.getWeight() != 0) {
                originalPistolGrip.setWeight(pistolGrip.getWeight());
            }

            // texture
            if (Objects.nonNull(pistolGrip.getTexture()) && !"".equalsIgnoreCase(pistolGrip.getTexture())) {
                originalPistolGrip.setTexture(pistolGrip.getTexture());
            }

            // color
            if (Objects.nonNull(pistolGrip.getColor()) && !"".equalsIgnoreCase(pistolGrip.getColor())) {
                originalPistolGrip.setColor(pistolGrip.getColor());
            }

            // hasCompartment
            if (Objects.nonNull(pistolGrip.hasCompartment())) {
                originalPistolGrip.setCompartment(pistolGrip.hasCompartment());
            }

            return pistolGripRepository.save(originalPistolGrip);
        }
        return null;
    }

    // DELETE
    public String deletePistolGrip (int id) {
        if (pistolGripRepository.findById(id).isPresent()) {
            pistolGripRepository.deleteById(id);
            return "Pistol Grip successfully deleted.";
        }
        return "Pistol Grip not found within database.";
    }
}
