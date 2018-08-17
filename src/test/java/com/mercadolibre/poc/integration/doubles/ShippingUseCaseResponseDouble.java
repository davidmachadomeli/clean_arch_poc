package com.mercadolibre.poc.integration.doubles;

import com.mercadolibre.poc.entities.ShippingCost;
import com.mercadolibre.poc.integration.use_cases.responses.UseCaseResponse;

public class ShippingUseCaseResponseDouble extends UseCaseResponse {

    public ShippingCost cost;

    public ShippingUseCaseResponseDouble(ShippingCost cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.cost.toString();
    }
}
