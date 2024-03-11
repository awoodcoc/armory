package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.Upper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpperRepository extends JpaRepository<Upper, Integer> {
}
