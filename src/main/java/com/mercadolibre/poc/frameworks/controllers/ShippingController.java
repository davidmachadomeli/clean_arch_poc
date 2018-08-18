package com.mercadolibre.poc.frameworks.controllers;

import com.mercadolibre.poc.adapters.builders.ShippingUseCaseBuilder;
import com.mercadolibre.poc.adapters.gateways.ItemGateway;
import com.mercadolibre.poc.adapters.gateways.UserGateway;
import com.mercadolibre.poc.frameworks.ShippingRequest;
import com.mercadolibre.poc.useCases.ShippingUseCase;

public class ShippingController {

    private ItemGateway itemGateway;
    private UserGateway userGateway;

    private ShippingUseCaseBuilder executor;

    /*   HERE WE CAN GET THIS GATEWAYS/EXECUTORS
     *   FROM GUICE
     *   OR DEPENDENCY INJECTION WITH SPRING CORE
     *   OR WHATEVER FW YOU WANT
     */
    public ShippingController(ShippingUseCaseBuilder executor, ItemGateway itemGateway, UserGateway userGateway) {
        this.executor = executor;

        this.itemGateway = itemGateway;
        this.userGateway = userGateway;
    }

    /* THIS COULD BE A METHOD FOR SPRING MVC
     * OR A ROUTE WITH SPARK
     * OR WHATEVER FW YOU WANT TO USE !!
     */
    public String getShippingCost(ShippingRequest req) {
        final ShippingUseCase useCase = this.executor
                .withItemGateway(this.itemGateway)
                .withUserGateway(this.userGateway)
                .withUserId(req.userId)
                .withItemId(req.itemId)
                .build();
        return useCase.doWork().toString();
    }

}
