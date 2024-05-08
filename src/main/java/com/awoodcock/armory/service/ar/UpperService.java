package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.UpperRepository;
import com.awoodcock.armory.models.ar.Upper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UpperService {

    // REPOSITORY
    private final UpperRepository upperRepository;

    // CONSTRUCTOR
    @Autowired
    public UpperService(UpperRepository upperRepository){
        this.upperRepository = upperRepository;
    }

    // CRUD OPERATIONS for Upper class

    // CREATE
    public Upper addUpper (Upper upper) {
        return upperRepository.save(upper);
    }

    // READ
    public Optional<Upper> getUpperById(int id) {
        return upperRepository.findById(id);
    }

    public List<Upper> getAllUppers() {
        return upperRepository.findAll();
    }

    // UPDATE

    // DELETE
    public void deleteUpper(int id) {
        upperRepository.deleteById(id);
    }

}
