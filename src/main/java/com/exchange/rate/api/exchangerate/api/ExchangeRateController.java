package com.exchange.rate.api.exchangerate.api;


import com.exchange.rate.api.exchangerate.model.entity.ExchangeRate;
import com.exchange.rate.api.exchangerate.model.request.ExchangeRateRequest;
import com.exchange.rate.api.exchangerate.model.request.ExchangeRateSearchRequest;
import com.exchange.rate.api.exchangerate.model.response.ExchangeRateResponse;
import com.exchange.rate.api.exchangerate.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import rx.Single;

@RestController
@RequestMapping("/api/v1/exchange-rate")
public class ExchangeRateController {


    @Autowired
    ExchangeRateService exchangeRateService;


    @GetMapping(produces = {MediaType.APPLICATION_STREAM_JSON_VALUE})
    public Single<ExchangeRateResponse> search(@RequestBody ExchangeRateSearchRequest request) {
       return exchangeRateService.calculate(request);
    }


    @PostMapping(produces = {MediaType.APPLICATION_STREAM_JSON_VALUE})
    public Single<ExchangeRateResponse> save(@RequestBody ExchangeRateRequest request) {
        return exchangeRateService.save(request);
    }


}