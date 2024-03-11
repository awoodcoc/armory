package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.Trigger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TriggerRepository extends JpaRepository<Trigger, Integer> {
}
