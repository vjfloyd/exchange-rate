package com.exchange.rate.api.exchangerate.service;


import com.exchange.rate.api.exchangerate.model.request.ExchangeRateRequest;
import com.exchange.rate.api.exchangerate.model.response.ExchangeRateResponse;
import rx.Single;

public interface ExchangeRateService {

    Single<ExchangeRateResponse> calculate(ExchangeRateRequest exchangeRateRequest);
}


