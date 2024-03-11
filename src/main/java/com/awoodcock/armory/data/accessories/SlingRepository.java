package com.awoodcock.armory.data.accessories;

import com.awoodcock.armory.models.accessories.Sling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlingRepository extends JpaRepository<Sling, Integer> {
}
