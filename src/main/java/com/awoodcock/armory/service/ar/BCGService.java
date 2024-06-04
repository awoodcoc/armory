package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.BCGRepository;
import com.awoodcock.armory.models.ar.BCG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
    public BCG getBCGById(int id) {
        Optional<BCG> bcg = bcgRepository.findById(id);
        return bcg.orElse(null);
    }

    public List<BCG> getAllBCGs() {
        return bcgRepository.findAll();
    }
    // UPDATE
    public BCG updateBCGById (int id, BCG bcg) {
        Optional<BCG> bcgOptional = bcgRepository.findById(id);
        if (bcgOptional.isPresent()) {
            BCG originalBCG = bcgOptional.get();

            // name
            if (Objects.nonNull(bcg.getName()) && !"".equalsIgnoreCase(bcg.getName())) {
                originalBCG.setName(bcg.getName());
            }

            // description
            if (Objects.nonNull(bcg.getDescription()) && !"".equalsIgnoreCase(bcg.getName())) {
                originalBCG.setDescription(bcg.getDescription());
            }

            // price
            if (Objects.nonNull(bcg.getPrice()) && bcg.getPrice() != 0) {
                originalBCG.setPrice(bcg.getPrice());
            }

            // weight
            if (Objects.nonNull(bcg.getWeight()) && bcg.getWeight() != 0) {
                originalBCG.setWeight(bcg.getWeight());
            }

            // boltMaterial
            if (Objects.nonNull(bcg.getBoltMaterial()) && !"".equalsIgnoreCase(bcg.getBoltMaterial())) {
                originalBCG.setBoltMaterial(bcg.getBoltMaterial());
            }

            // finish
            if (Objects.nonNull(bcg.getFinish()) && !"".equalsIgnoreCase(bcg.getFinish())) {
                originalBCG.setFinish(bcg.getFinish());
            }

            return bcgRepository.save(originalBCG);
        }
        return null;
    }

    // DELETE
    public String deleteBCG(int id) {
        if (bcgRepository.findById(id).isPresent()) {
            bcgRepository.deleteById(id);
            return "BCG successfully deleted from database.";
        }
        return "BCG not found within database.";
    }
}
