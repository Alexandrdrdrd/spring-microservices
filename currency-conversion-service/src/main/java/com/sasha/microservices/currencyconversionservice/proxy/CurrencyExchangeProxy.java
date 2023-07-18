package com.sasha.microservices.currencyconversionservice.proxy;

import com.sasha.microservices.currencyconversionservice.entity.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

//@FeignClient(name = "currency-exchange", url = "localhost:8000")

//включение баллансировки

@FeignClient(name = "currency-exchange")

public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
   CurrencyConversion retrieveExchangeValue(@PathVariable String from, @PathVariable String to);

}
