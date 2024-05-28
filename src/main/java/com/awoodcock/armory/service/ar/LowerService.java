package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.LowerRepository;
import com.awoodcock.armory.models.ar.Lower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
    public Lower getLowerById(int id) {
        Optional<Lower> lower = lowerRepository.findById(id);
        return lower.orElse(null);
    }

    public List<Lower> getAllLowers() {
        return lowerRepository.findAll();
    }

    // UPDATE
    public Lower updateLowerById(int id, Lower lower) {
        Optional<Lower> lowerOptional = lowerRepository.findById(id);

        if (lowerOptional.isPresent()) {
            Lower originalLower = lowerOptional.get();

            // name
            if (Objects.nonNull(lower.getName()) && !"".equalsIgnoreCase(lower.getName())) {
                originalLower.setName(lower.getName());
            }

            // description
            if (Objects.nonNull(lower.getDescription()) && !"".equalsIgnoreCase(lower.getName())) {
                originalLower.setDescription(lower.getDescription());
            }

            // price
            if (Objects.nonNull(lower.getPrice()) && lower.getPrice() != 0) {
                originalLower.setPrice(lower.getPrice());
            }

            // weight
            if (Objects.nonNull(lower.getWeight()) && lower.getWeight() != 0) {
                originalLower.setWeight(lower.getWeight());
            }

            // color
            if (Objects.nonNull(lower.getColor()) && !"".equalsIgnoreCase(lower.getColor())) {
                originalLower.setColor(lower.getColor());
            }

            // isComplete
            if (Objects.nonNull(lower.isComplete())) {
                originalLower.setComplete(lower.isComplete());
            }

            return lowerRepository.save(originalLower);
        }
        return null;
    }

    // DELETE
    public String deleteLower(int id) {
        if (lowerRepository.findById(id).isPresent()) {
            lowerRepository.deleteById(id);
            return "Lower successfully deleted.";
        }
        return "Lower not found in database.";
    }

}
