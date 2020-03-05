package com.exchange.rate.api.exchangerate.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
public class ExchangeRateResponse {

    private String code;//monto base
    private BigDecimal exchangeRateValue; // monto calculado
    private String fromCurrency; // moneda inicial
    private String toCurrency; // moneda destino
}
