package com.learningrest.stockapp.service;

import com.learningrest.stockapp.model.Intraday;

public interface IStockMarketSerivice {

    Intraday[] getIntradayTrades(String stock);
    
}
