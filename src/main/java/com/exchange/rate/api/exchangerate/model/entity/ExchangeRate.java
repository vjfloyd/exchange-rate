package com.exchange.rate.api.exchangerate.model.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Builder
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeRate {
    @Id
    private String code; //USD-PEN
    private String fromCurrency;//USD
    private String toCurrency;//PEN
    private BigDecimal exchangeRateValue;// 3.20


}
