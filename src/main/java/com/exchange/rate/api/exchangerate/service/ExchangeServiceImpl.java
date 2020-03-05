package com.exchange.rate.api.exchangerate.service;

import com.exchange.rate.api.exchangerate.model.entity.ExchangeRate;
import com.exchange.rate.api.exchangerate.model.request.ExchangeRateRequest;
import com.exchange.rate.api.exchangerate.model.response.ExchangeRateResponse;
import com.exchange.rate.api.exchangerate.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Observable;
import rx.Single;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class ExchangeServiceImpl implements ExchangeRateService {

    @Autowired
    ExchangeRateRepository exchangeRateRepository;


    @Override
    public Single<ExchangeRateResponse> calculate(ExchangeRateRequest exchangeRateRequest) {
            String code = exchangeRateRequest.getFromCurrency() +
                    exchangeRateRequest.getToCurrency();

//          Optional<ExchangeRate> exchangeRate =
//                  exchangeRateRepository.findById(code);
//          BigDecimal amountFinal = null;
//          if (exchangeRate.isPresent()){
//              amountFinal = exchangeRateRequest.getBaseAmount()
//                      .multiply(exchangeRate.get().getValue());
//
//          }
//
//
//
//        return Single.just(ExchangeRateResponse.builder()
//                .baseAmount(exchangeRateRequest.getBaseAmount())
//                .calculatedAmount(amountFinal)
//                .fromCurrency(exchangeRateRequest.getFromCurrency())
//                .toCurrency(exchangeRateRequest.getToCurrency())
//                .build());

            return null;

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
            .exchangeRateValue(request.getExchangeRateValue())
            .fromCurrency(request.getFromCurrency())
            .toCurrency(request.getToCurrency())
            .code(exchangeRate.getCode())
                .build()
        );
    }

}
//
//INSERT INTO exchangerate (first_name, last_name, career) VALUES
//  ('Aliko', 'Dangote', 'Billionaire Industrialist'),