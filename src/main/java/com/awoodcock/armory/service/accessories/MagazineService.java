package com.awoodcock.armory.service.accessories;

import com.awoodcock.armory.data.accessories.MagazineRepository;
import com.awoodcock.armory.models.accessories.Magazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MagazineService {

    // REPOSITORY
    private final MagazineRepository magazineRepository;

    // CONSTRUCTOR
    @Autowired
    public MagazineService (MagazineRepository magazineRepository) {
        this.magazineRepository = magazineRepository;
    }

    // CRUD OPERATIONS for MAGAZINE class

    // CREATE
    public Magazine addMagazine (Magazine magazine) {
        return magazineRepository.save(magazine);
    }

    // READ
    public Magazine getMagazineById (int id) {
        Optional<Magazine> magazine = magazineRepository.findById(id);
        return magazine.orElse(null);
    }

    public List<Magazine> getAllMagazines() {return magazineRepository.findAll();}

    // UPDATE
    public Magazine updateMagazineById(int id, Magazine magazine) {
        Optional<Magazine> magazineOptional = magazineRepository.findById(id);

        if (magazineOptional.isPresent()) {
            Magazine originalMagazine = magazineOptional.get();

            // name
            if (Objects.nonNull(magazine.getName()) && !"".equalsIgnoreCase(magazine.getName())) {
                originalMagazine.setName(magazine.getName());
            }

            // description
            if (Objects.nonNull(magazine.getDescription()) && !"".equalsIgnoreCase(magazine.getName())) {
                originalMagazine.setDescription(magazine.getDescription());
            }

            // price
            if (Objects.nonNull(magazine.getPrice()) && magazine.getPrice() != 0) {
                originalMagazine.setPrice(magazine.getPrice());
            }

            // weight
            if (Objects.nonNull(magazine.getWeight()) && magazine.getWeight() != 0) {
                originalMagazine.setWeight(magazine.getWeight());
            }

            // capacity
            if (Objects.nonNull(magazine.getCapacity()) && magazine.getCapacity() != 0) {
                originalMagazine.setCapacity(magazine.getCapacity());
            }

            // numMags
            if (Objects.nonNull(magazine.getNumMags()) && magazine.getNumMags() != 0) {
                originalMagazine.setNumMags(magazine.getNumMags());
            }

            return magazineRepository.save(originalMagazine);
        }
        return null;
    }

    // DELETE
    public String deleteMagazine(int id) {
        if (magazineRepository.findById(id).isPresent()) {
            magazineRepository.deleteById(id);
            return "Magazine successfully deleted.";
        }
        return "Magazine not found in database";
    }
}
