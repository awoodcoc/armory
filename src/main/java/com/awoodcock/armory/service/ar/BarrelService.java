package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.BarrelRepository;
import com.awoodcock.armory.models.ar.Barrel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
    public Barrel getBarrelById (int id) {
        Optional<Barrel> barrel = barrelRepository.findById(id);
        return barrel.orElse(null);
    }

    public List<Barrel> getAllBarrels() {
        return barrelRepository.findAll();
    }

    // UPDATE

    public Barrel updateBarrelById(int id, Barrel barrel) {
        Optional<Barrel> barrelOptional = barrelRepository.findById(id);
        if (barrelOptional.isPresent()) {
            Barrel originalBarrel = barrelOptional.get();

            // name
            if (Objects.nonNull(barrel.getName()) && !"".equalsIgnoreCase(barrel.getName())) {
                originalBarrel.setName(barrel.getName());
            }

            // description
            if (Objects.nonNull(barrel.getDescription()) && !"".equalsIgnoreCase(barrel.getName())) {
                originalBarrel.setDescription(barrel.getDescription());
            }

            // price
            if (Objects.nonNull(barrel.getPrice()) && barrel.getPrice() != 0) {
                originalBarrel.setPrice(barrel.getPrice());
            }

            // weight
            if (Objects.nonNull(barrel.getWeight()) && barrel.getWeight() != 0) {
                originalBarrel.setWeight(barrel.getWeight());
            }

            // barrelLength
            if (Objects.nonNull(barrel.getLength()) && barrel.getLength() != 0) {
                originalBarrel.setLength(barrel.getLength());
            }

            return barrelRepository.save(originalBarrel);
        }

        return null;
    }


    // DELETE
    public String deleteBarrel(int id) {
        if (barrelRepository.findById(id).isPresent()) {
            barrelRepository.deleteById(id);
            return "Barrel successfully deleted.";
        }
        return "Barrel not found within database.";
    }
}
