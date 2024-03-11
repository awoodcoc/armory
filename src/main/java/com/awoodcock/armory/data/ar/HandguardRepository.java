package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.Handguard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HandguardRepository extends JpaRepository<Handguard, Integer> {
}
