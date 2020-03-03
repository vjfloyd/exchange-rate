package com.exchange.rate.api.exchangerate.service;

import com.exchange.rate.api.exchangerate.model.request.ExchangeRateRequest;
import com.exchange.rate.api.exchangerate.model.response.ExchangeRateResponse;
import org.springframework.stereotype.Service;
import rx.Single;

@Service
public class ExchangeServiceImpl implements ExchangeRateService {


    @Override
    public Single<ExchangeRateResponse> calculate(ExchangeRateRequest exchangeRateRequest) {
        return null;
    }
}
