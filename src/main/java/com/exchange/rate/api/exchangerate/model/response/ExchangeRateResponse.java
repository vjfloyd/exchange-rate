package com.exchange.rate.api.exchangerate.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRateResponse {

    private Boolean amount;
    private String fromCurrency;
    private String toCurrency;
}
