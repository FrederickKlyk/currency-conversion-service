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
//@FeignClient(name = "currency-exchange", url = "http://localhost:8001")
//client-side Loadbalancing inkl. Kommunikation mit dem Eureka Server über den FeignClient und Eureka client out of the box
@FeignClient(name = "currency-exchange")
public interface CurrencyConversionProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to
    );
}
