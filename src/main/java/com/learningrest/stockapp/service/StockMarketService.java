package com.learningrest.stockapp.service;

import com.learningrest.stockapp.model.Intraday;
import com.learningrest.stockapp.repository.IStockMarketRepository;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;

@Service
public class StockMarketService implements IStockMarketSerivice {

    private IStockMarketRepository stockMarketRepository;

    /**
     * Constructor
     */
    public StockMarketService(IStockMarketRepository stockMarketRepository) {
        this.stockMarketRepository = stockMarketRepository;
    }

    /**
     * Call the api implemented in StockMarketRepository and return the total sum of
     * numberofTrades.
     */
    @Override
    public Intraday[] getIntradayTrades(String stock) {
        return this.stockMarketRepository.getIntradayTrades(stock);
    }

    /**
     * Call the api implemented in StockMarketRepository and return the total sum of
     * numberofTrades.
     * @param stock name for which we need total number of trades.
     * @return Total NUmber of trades of Intraday trading.
     */
    @Override
    public int getTotalNumberOfTrades(String stock) {
        throw new NotImplementedException();
    }

    /**
     * Get the lowest trade price from the Intraday trading.
     * 
     * @param stock for which we need to find the lowest price.
     * @return lowest price.
     */
    @Override
    public double getLowestTradePrice(String stock) {
        throw new NotImplementedException();
    }

    /**
     * Get the highest trade price from the Intraday trading.
     * 
     * @param atock for which we need to find the lowest price.
     * @return highest price.
     */
    @Override
    public double getHighestTradePrice(String atock) {
        throw new NotImplementedException();
    }
}