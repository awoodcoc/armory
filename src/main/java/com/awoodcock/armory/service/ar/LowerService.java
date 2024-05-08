package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.LowerRepository;
import com.awoodcock.armory.models.ar.Lower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LowerService {

    // REPOSITORY
    private final LowerRepository lowerRepository;

    // CONSTRUCTOR
    @Autowired
    public LowerService (LowerRepository lowerRepository) {
        this.lowerRepository = lowerRepository;
    }

    // CRUD OPERATIONS for Lower class

    // CREATE
    public Lower addLower (Lower lower) {
        return lowerRepository.save(lower);
    }

    // READ
    public Optional<Lower> getLowerById (int id) {
        return lowerRepository.findById(id);
    }

    public List<Lower> getAllLowers () {
        return lowerRepository.findAll();
    }

    // UPDATE

    // DELETE
    public void deleteLower(int id) {
        lowerRepository.deleteById(id);
    }
}
