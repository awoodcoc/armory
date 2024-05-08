package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.TrigRepository;
import com.awoodcock.armory.models.ar.Trig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrigService {

    // REPOSITORY
    private final TrigRepository trigRepository;

    // CONSTRUCTOR
    @Autowired
    public TrigService(TrigRepository trigRepository) {
        this.trigRepository = trigRepository;
    }

    // CRUD OPERATIONS for Trig class

    // CREATE
    public Trig addTrig (Trig trig) {
        return trigRepository.save(trig);
    }

    // READ
    public Optional<Trig> getTrigById (int id) {
        return trigRepository.findById(id);
    }

    public List<Trig> getAllTrigs () {
        return trigRepository.findAll();
    }

    // UPDATE

    // DELETE
    public void deleteTrig(int id) {
        trigRepository.deleteById(id);
    }
}
