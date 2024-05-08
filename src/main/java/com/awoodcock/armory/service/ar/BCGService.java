package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.BCGRepository;
import com.awoodcock.armory.models.ar.BCG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BCGService {

    // REPOSITORY
    private final BCGRepository bcgRepository;

    // CONSTRUCTOR
    @Autowired
    public BCGService (BCGRepository bcgRepository) {
        this.bcgRepository = bcgRepository;
    }

    // CRUD OPERATIONS for BCG class

    // CREATE
    public BCG addBCG (BCG bcg) {
        return bcgRepository.save(bcg);
    }

    // READ
    public Optional<BCG> getBCGById(int id) {
        return bcgRepository.findById(id);
    }

    public List<BCG> getAllBCGs() {
        return bcgRepository.findAll();
    }
    // UPDATE

    // DELETE
    public void deleteBCG(int id) {
        bcgRepository.deleteById(id);
    }
}
