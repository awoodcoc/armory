package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.ARRepository;
import com.awoodcock.armory.models.ar.AR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ARService {

    // REPOSITORY
    private final ARRepository arRepository;

    // CONSTRUCTOR
    @Autowired
    public ARService (ARRepository arRepository) {
        this.arRepository = arRepository;
    }

    // CRUD OPERATIONS for AR class

    // CREATE

    // READ

    // UPDATE

    // DELETE

}
