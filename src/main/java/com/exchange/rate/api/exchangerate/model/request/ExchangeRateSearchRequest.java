package com.exchange.rate.api.exchangerate.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRateSearchRequest {

    private Boolean amount;
    private String fromCurrency;
    private String toCurrency;


}
