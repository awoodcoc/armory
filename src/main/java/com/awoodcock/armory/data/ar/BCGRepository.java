package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.BCG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BCGRepository extends JpaRepository<BCG, Integer> {
}
