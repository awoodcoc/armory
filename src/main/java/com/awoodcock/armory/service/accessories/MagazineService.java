package com.awoodcock.armory.service.accessories;

import com.awoodcock.armory.data.accessories.MagazineRepository;
import com.awoodcock.armory.models.accessories.Magazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public Optional<Magazine> getMagazineById (int id) {
        return magazineRepository.findById(id);
    }

    public List<Magazine> getAllMagazines() {return magazineRepository.findAll();}

    // UPDATE

    // DELETE
    public void deleteMagazine(int id) {magazineRepository.deleteById(id);}
}
