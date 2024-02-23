package de.fred.microservices.currencyconversionservice.controller;

import de.fred.microservices.currencyconversionservice.model.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Typically, we would use the application name
 * of the service that we would want to call in here.
 * --> LookUp application.properties in currency-exchange-service
 */
@FeignClient(name = "currency-exchange", url = "http://localhost:8001")
public interface CurrencyConversionProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
    );
}
