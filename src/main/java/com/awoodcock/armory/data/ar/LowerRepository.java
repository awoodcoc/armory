package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.Lower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LowerRepository extends JpaRepository<Lower, Integer> {
}
