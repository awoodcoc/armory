package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.ChargingHandle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargingHandleRepository extends JpaRepository<ChargingHandle, Integer> {
}
