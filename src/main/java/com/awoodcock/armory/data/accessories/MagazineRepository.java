package com.awoodcock.armory.data.accessories;

import com.awoodcock.armory.models.accessories.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazineRepository extends JpaRepository<Magazine, Integer> {
}
