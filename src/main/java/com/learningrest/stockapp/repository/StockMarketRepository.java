package com.learningrest.stockapp.repository;

import com.learningrest.stockapp.model.Intraday;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class StockMarketRepository implements IStockMarketRepository {

    RestTemplate restTemplate;

    @Value("${api.stockMarket.token}")
    private String stockApiToken;

    /**
     * 
     */
    public StockMarketRepository() {
        restTemplate = new RestTemplateBuilder().build();
    }


    @Override
    public Intraday[] getIntradayTrades(String stock) {
        ResponseEntity<Intraday[]> intradayTrades = restTemplate
            .exchange("https://sandbox.iexapis.com/stable/stock/"+stock+"/intraday-prices?token="+stockApiToken, HttpMethod.GET, null, Intraday[].class);
        return intradayTrades.getBody();
    }
    
}