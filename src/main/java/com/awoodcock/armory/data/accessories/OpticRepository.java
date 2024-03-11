package com.awoodcock.armory.data.accessories;

import com.awoodcock.armory.models.accessories.Optic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpticRepository extends JpaRepository<Optic, Integer> {
}
