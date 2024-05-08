package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.ChargingHandleRepository;
import com.awoodcock.armory.models.ar.ChargingHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChargingHandleService {

    // REPOSITORY
    private final ChargingHandleRepository chargingHandleRepository;

    // CONSTRUCTOR
    @Autowired
    public ChargingHandleService (ChargingHandleRepository chargingHandleRepository) {
        this.chargingHandleRepository = chargingHandleRepository;
    }

    // CRUD OPERATIONS for ChargingHandle class

    // CREATE
    public ChargingHandle addChargingHandle (ChargingHandle chargingHandle) {
        return chargingHandleRepository.save(chargingHandle);
    }

    // READ
    public Optional<ChargingHandle> getChargingHandleById (int id) {
        return chargingHandleRepository.findById(id);
    }

    public List<ChargingHandle> getAllChargingHandles() {
        return chargingHandleRepository.findAll();
    }

    // UPDATE

    // DELETE
    public void deleteChargingHandle(int id) {
        chargingHandleRepository.deleteById(id);
    }
}
