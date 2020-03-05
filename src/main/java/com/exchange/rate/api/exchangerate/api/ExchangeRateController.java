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


    @GetMapping
    public Single<ExchangeRateResponse> search(@RequestBody ExchangeRateSearchRequest request) {
       return null;
    }


    @PostMapping(value = "/save", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE})
    public Single<ExchangeRateResponse> save(@RequestBody ExchangeRateRequest request) {
        return exchangeRateService.save(request);
    }


}

//
//
//    Desarrollar una API con las siguientes consideraciones y funcionalidades:
//        Consideraciones técnicas:
//        El lenguaje de programación a utilizar es Java con el framework Spring Boot.
//        Utilizar programación reactiva RxJava
//        Funcionalidades Requeridas:
//        Se debe crear una API para aplicar un tipo de cambio a un monto.
//        La API debe recibir el valor “monto“, “moneda origen”, “moneda destino“ y devolver el “monto”, “monto con tipo de cambio”, “moneda origen”, “moneda destino“  y “tipo de cambio”.
//        Se debe crear la información del tipo de cambio en una in memory database, por ejemplo H2.
//        El uso de la API debe ser mostrada desde un cliente Http (Postman).
//        Crear un post para actualizar el valor del tipo de cambio.