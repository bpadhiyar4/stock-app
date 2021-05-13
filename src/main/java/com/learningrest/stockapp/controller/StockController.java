package com.learningrest.stockapp.controller;

import com.learningrest.stockapp.model.Intraday;
import com.learningrest.stockapp.service.IStockMarketSerivice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stock")
public class StockController {
    
    private IStockMarketSerivice stockMarketSerivice;

    public StockController(IStockMarketSerivice stockMarketSerivice) {
        this.stockMarketSerivice = stockMarketSerivice;
    }

    @GetMapping("/intraday/{stock}")
    public Intraday[] getStockIntradayTrading(@PathVariable("stock") String stock) {
        return this.stockMarketSerivice.getIntradayTrades(stock);
    }
}