package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.Trig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrigRepository extends JpaRepository<Trig, Integer> {
}
