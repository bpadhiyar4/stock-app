package com.learningrest.stockapp.service;

import com.learningrest.stockapp.model.Intraday;

public interface IStockMarketSerivice {

    /**
     * method to retrieves the intraday trading information.
     * @param stock for which we need an intraday stock info.
     * @return All intraday trading object.
     */
    Intraday[] getIntradayTrades(String stock);

    /**
     * Call the api implemented in StockMarketRepository and return the total sum of
     * numberofTrades.
     */
    int getTotalNumberOfTrades(String stock);

    /**
     * Get the lowest trade price from the Intraday trading.
     * 
     * @param stock for which we need to find the lowest price.
     * @return lowest price.
     */
    double getLowestTradePrice(String stock);

    /**
     * Get the highest trade price from the Intraday trading.
     * 
     * @param atock for which we need to find the lowest price.
     * @return highest price.
     */
    double getHighestTradePrice(String atock);
}
