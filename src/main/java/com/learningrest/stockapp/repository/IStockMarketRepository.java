package com.learningrest.stockapp.repository;

import com.learningrest.stockapp.model.Intraday;

public interface IStockMarketRepository {

    Intraday[] getIntradayTrades(String stock);
}
