package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.TrigRepository;
import com.awoodcock.armory.models.ar.Trig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
    public Trig getTrigById (int id) {
        Optional<Trig> trig = trigRepository.findById(id);
        return trig.orElse(null);
    }

    public List<Trig> getAllTrigs () {
        return trigRepository.findAll();
    }

    // UPDATE
    public Trig updateTrigById(int id, Trig trig) {
        Optional<Trig> trigOptional = trigRepository.findById(id);

        if (trigOptional.isPresent()) {
            Trig originalTrig = trigOptional.get();

            // name
            if (Objects.nonNull(trig.getName()) && !"".equalsIgnoreCase(trig.getName())) {
                originalTrig.setName(trig.getName());
            }

            // description
            if (Objects.nonNull(trig.getDescription()) && !"".equalsIgnoreCase(trig.getName())) {
                originalTrig.setDescription(trig.getDescription());
            }

            // price
            if (Objects.nonNull(trig.getPrice()) && trig.getPrice() != 0) {
                originalTrig.setPrice(trig.getPrice());
            }

            // weight
            if (Objects.nonNull(trig.getWeight()) && trig.getWeight() != 0) {
                originalTrig.setWeight(trig.getWeight());
            }

            if (Objects.nonNull(trig.getPullWeight()) && trig.getPullWeight() != 0) {
                originalTrig.setPullWeight(trig.getPullWeight());
            }

            return trigRepository.save(originalTrig);
        }
        return null;
    }

    // DELETE
    public String deleteTrig(int id) {
        if (trigRepository.findById(id).isPresent()) {
            trigRepository.deleteById(id);
            return "Trigger successfully deleted.";
        }
        return "Trigger not found within database.";
    }
}
