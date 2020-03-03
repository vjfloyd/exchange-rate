package com.exchange.rate.api.exchangerate.api;


import com.exchange.rate.api.exchangerate.model.request.ExchangeRateRequest;
import com.exchange.rate.api.exchangerate.model.response.ExchangeRateResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Single;

@RestController
@RequestMapping("/api/v1")
public class ExchangeRateController {


    public Single<ExchangeRateResponse> search(@RequestBody ExchangeRateRequest exchangeRateRequest) {
       return null;
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