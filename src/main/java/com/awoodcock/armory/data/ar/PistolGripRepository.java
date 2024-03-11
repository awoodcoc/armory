package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.PistolGrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PistolGripRepository extends JpaRepository<PistolGrip, Integer> {
}
