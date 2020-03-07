package com.exchange.rate.api.exchangerate.service;

import com.exchange.rate.api.exchangerate.model.entity.ExchangeRate;
import com.exchange.rate.api.exchangerate.model.request.ExchangeRateRequest;
import com.exchange.rate.api.exchangerate.model.request.ExchangeRateSearchRequest;
import com.exchange.rate.api.exchangerate.model.response.ExchangeRateResponse;
import com.exchange.rate.api.exchangerate.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.Single;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExchangeServiceImpl implements ExchangeRateService {

    @Autowired
    ExchangeRateRepository exchangeRateRepository;


    @Override
    public Single<ExchangeRateResponse> calculate(ExchangeRateSearchRequest request) {
        String code = request.getFromCurrency().concat(request.getToCurrency());

        Optional<ExchangeRate> exchangeRate =
                  exchangeRateRepository.findById(code);
          BigDecimal amountFinal = null;
          if (exchangeRate.isPresent()){
              amountFinal = request.getAmount()
                      .multiply(exchangeRate.get().getExchangeRateValue());
          }else{
              //
          }

         ExchangeRateResponse response =  ExchangeRateResponse.builder()
                 .code(exchangeRate.get().getCode())
                 .amount(amountFinal)
                 .fromCurrency(exchangeRate.get().getFromCurrency())
                 .toCurrency(exchangeRate.get().getToCurrency())
                 .build();

        return Single.just(response);
    }

    @Override
    public Single<ExchangeRateResponse> save(ExchangeRateRequest request) {
        ExchangeRate exchangeRate  = ExchangeRate.builder()
              .code(request.getFromCurrency().concat(request.getToCurrency()))
                .fromCurrency(request.getFromCurrency())
                .toCurrency(request.getToCurrency())
                .exchangeRateValue(request.getExchangeRateValue())
                .build();
        exchangeRateRepository.save(exchangeRate);
        return Single.just(ExchangeRateResponse.builder()
            .amount(request.getExchangeRateValue())
            .fromCurrency(request.getFromCurrency())
            .toCurrency(request.getToCurrency())
            .code(exchangeRate.getCode())
                .build()
        );
    }

}