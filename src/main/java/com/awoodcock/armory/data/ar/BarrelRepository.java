package com.awoodcock.armory.data.ar;


import com.awoodcock.armory.models.ar.Barrel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarrelRepository extends JpaRepository<Barrel, Integer> {
}
