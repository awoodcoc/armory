package com.awoodcock.armory.data.ar;

import com.awoodcock.armory.models.ar.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {
}
