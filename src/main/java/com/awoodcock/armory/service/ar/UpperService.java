package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.UpperRepository;
import com.awoodcock.armory.models.ar.Upper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
    public Upper getUpperById(int id) {
        Optional<Upper> upper = upperRepository.findById(id);
        return upper.orElse(null);
    }

    public List<Upper> getAllUppers() {
        return upperRepository.findAll();
    }

    // UPDATE
    public Upper updateUpperById(int id, Upper upper) {
        Optional<Upper> upperOptional = upperRepository.findById(id);

        if (upperOptional.isPresent()) {
            Upper originalUpper = upperOptional.get();

            // name
            if (Objects.nonNull(upper.getName()) && !"".equalsIgnoreCase(upper.getName())) {
                originalUpper.setName(upper.getName());
            }

            // description
            if (Objects.nonNull(upper.getDescription()) && !"".equalsIgnoreCase(upper.getName())) {
                originalUpper.setDescription(upper.getDescription());
            }

            // price
            if (Objects.nonNull(upper.getPrice()) && upper.getPrice() != 0) {
                originalUpper.setPrice(upper.getPrice());
            }

            // weight
            if (Objects.nonNull(upper.getWeight()) && upper.getWeight() != 0) {
                originalUpper.setWeight(upper.getWeight());
            }

            // color
            if (Objects.nonNull(upper.getColor()) && !"".equalsIgnoreCase(upper.getColor())) {
                originalUpper.setColor(upper.getColor());
            }

            // isComplete
            if (Objects.nonNull(upper.isComplete())) {
                originalUpper.setComplete(upper.isComplete());
            }

            return upperRepository.save(originalUpper);
        }
        return null;
    }

    // DELETE
    public String deleteUpper(int id) {
        if (upperRepository.findById(id).isPresent()) {
            upperRepository.deleteById(id);
            return "Upper successfully deleted.";
        }
        return "Upper not found in database.";
    }

}
