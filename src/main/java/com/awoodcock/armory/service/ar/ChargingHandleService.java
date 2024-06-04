package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.ChargingHandleRepository;
import com.awoodcock.armory.models.ar.ChargingHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Objects;
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
    public ChargingHandle getChargingHandleById (int id) {
        Optional<ChargingHandle> chargingHandle = chargingHandleRepository.findById(id);
        return chargingHandle.orElse(null);
    }

    public List<ChargingHandle> getAllChargingHandles() {
        return chargingHandleRepository.findAll();
    }

    // UPDATE
    public ChargingHandle updateChargingHandleById (int id, ChargingHandle chargingHandle) {
        Optional<ChargingHandle> chargingHandleOptional = chargingHandleRepository.findById(id);

        if (chargingHandleOptional.isPresent()) {
            ChargingHandle originalChargingHandle = chargingHandleOptional.get();

            // name
            if (Objects.nonNull(chargingHandle.getName()) && !"".equalsIgnoreCase(chargingHandle.getName())) {
                originalChargingHandle.setName(chargingHandle.getName());
            }

            // description
            if (Objects.nonNull(chargingHandle.getDescription()) && !"".equalsIgnoreCase(chargingHandle.getName())) {
                originalChargingHandle.setDescription(chargingHandle.getDescription());
            }

            // price
            if (Objects.nonNull(chargingHandle.getPrice()) && chargingHandle.getPrice() != 0) {
                originalChargingHandle.setPrice(chargingHandle.getPrice());
            }

            // weight
            if (Objects.nonNull(chargingHandle.getWeight()) && chargingHandle.getWeight() != 0) {
                originalChargingHandle.setWeight(chargingHandle.getWeight());
            }

            // color
            if (Objects.nonNull(chargingHandle.getColor()) && !"".equalsIgnoreCase(chargingHandle.getColor())) {
                originalChargingHandle.setColor(chargingHandle.getColor());
            }

            // isAmbi
            if (Objects.nonNull(chargingHandle.isAbmi())) {
                originalChargingHandle.setAbmi(chargingHandle.isAbmi());
            }

            return chargingHandleRepository.save(originalChargingHandle);
        }
        return null;
    }

    // DELETE
    public String deleteChargingHandle(int id) {
        if (chargingHandleRepository.findById(id).isPresent()) {
            chargingHandleRepository.deleteById(id);
            return "Charging Handle successfully deleted.";
        }
        return "Charging Handle not found within database.";
    }
}
