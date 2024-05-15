package com.awoodcock.armory.service.ar;

import com.awoodcock.armory.data.ar.StockRepository;
import com.awoodcock.armory.models.ar.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
    public Stock getStockById (int id) {
        Optional <Stock> stock = stockRepository.findById(id);
        return stock.orElse(null);
    }

    public List<Stock> getAllStocks () {
        return stockRepository.findAll();
    }
    // UPDATE
    public Stock updateStockById(int id, Stock stock) {
        Optional<Stock> stockOptional = stockRepository.findById(id);

        if (stockOptional.isPresent()) {
            Stock originalStock = stockOptional.get();

            // name
            if (Objects.nonNull(stock.getName()) && !"".equalsIgnoreCase(stock.getName())) {
                originalStock.setName(stock.getName());
            }

            // description
            if (Objects.nonNull(stock.getDescription()) && !"".equalsIgnoreCase(stock.getName())) {
                originalStock.setDescription(stock.getDescription());
            }

            // price
            if (Objects.nonNull(stock.getPrice()) && stock.getPrice() != 0) {
                originalStock.setPrice(stock.getPrice());
            }

            // weight
            if (Objects.nonNull(stock.getWeight()) && stock.getWeight() != 0) {
                originalStock.setWeight(stock.getWeight());
            }

            // color
            if (Objects.nonNull(stock.getColor()) && !"".equalsIgnoreCase(stock.getColor())) {
                originalStock.setColor(stock.getColor());
            }

            // isAdjustable
            if (Objects.nonNull(stock.isAdjustable())) {
                originalStock.setAdjustable(stock.isAdjustable());
            }

            return stockRepository.save(originalStock);
        }
        return null;
    }

    // DELETE
    public String deleteStock(int id) {
        if (stockRepository.findById(id).isPresent()) {
            stockRepository.deleteById(id);
            return "Stock successfully deleted from database.";
        }
        return "Stock not found within database.";
    }
}
