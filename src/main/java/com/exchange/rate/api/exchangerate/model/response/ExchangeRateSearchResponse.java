package com.exchange.rate.api.exchangerate.model.response;

import java.math.BigDecimal;

public class ExchangeRateSearchResponse {
    private String code;//monto base
    private BigDecimal amount; // monto calculado
    private String fromCurrency; // moneda inicial
    private String toCurrency; // moneda destino
}
