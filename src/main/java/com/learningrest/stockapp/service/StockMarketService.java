package com.learningrest.stockapp.service;

import com.learningrest.stockapp.model.Intraday;
import com.learningrest.stockapp.repository.IStockMarketRepository;

import org.springframework.stereotype.Service;

@Service
public class StockMarketService implements IStockMarketSerivice{


    private IStockMarketRepository stockMarketRepository;

    /**
     * 
     */
    public StockMarketService(IStockMarketRepository stockMarketRepository) {
        this.stockMarketRepository = stockMarketRepository;
    }

    @Override
    public Intraday[] getIntradayTrades(String stock) {
        return this.stockMarketRepository.getIntradayTrades(stock);
    }
}