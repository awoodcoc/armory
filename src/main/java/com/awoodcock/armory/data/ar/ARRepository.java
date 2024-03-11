package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.AR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ARRepository extends JpaRepository<AR, Integer> {
    Optional<AR> findById(int id);
}
