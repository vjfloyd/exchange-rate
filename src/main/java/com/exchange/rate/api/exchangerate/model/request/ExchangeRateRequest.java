package com.exchange.rate.api.exchangerate.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeRateRequest {

    private Boolean amount;
    private Boolean calculatedAmount;
    private String fromCurrency;
    private String toCurrency;
    private Boolean exchangeRateValue;

}
