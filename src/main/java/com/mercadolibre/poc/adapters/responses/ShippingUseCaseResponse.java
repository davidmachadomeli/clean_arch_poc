package com.mercadolibre.poc.adapters.responses;

import com.mercadolibre.poc.integration.use_cases.responses.UseCaseResponse;

public class ShippingUseCaseResponse extends UseCaseResponse {

    public String cost;

    public ShippingUseCaseResponse(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.cost;
    }
}
