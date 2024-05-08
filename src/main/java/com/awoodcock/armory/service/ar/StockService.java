package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.StockRepository;
import com.awoodcock.armory.models.ar.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    // REPOSITORY
    private final StockRepository stockRepository;

    // CONSTRUCTOR
    @Autowired
    public StockService (StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    // CRUD OPERATIONS for Stock class

    // CREATE
    public Stock addStock (Stock stock) {
        return stockRepository.save(stock);
    }

    // READ
    public Optional<Stock> getStockById (int id) {
        return stockRepository.findById(id);
    }

    public List<Stock> getAllStocks () {
        return stockRepository.findAll();
    }
    // UPDATE

    // DELETE
    public void deleteStock(int id) {
        stockRepository.deleteById(id);
    }
}
