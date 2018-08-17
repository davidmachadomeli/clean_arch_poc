package com.mercadolibre.poc.adapters.presenters;

import com.mercadolibre.poc.adapters.responses.ShippingUseCaseResponse;
import com.mercadolibre.poc.entities.ShippingCost;
import com.mercadolibre.poc.integration.use_cases.presenters.Presenter;
import com.mercadolibre.poc.integration.use_cases.responses.UseCaseResponse;

public class ShippingPresenter implements Presenter<ShippingCost> {

    @Override
    public UseCaseResponse present(ShippingCost cost) {
        final String costAsString = "cost : " + cost.toString().toLowerCase();
        return new ShippingUseCaseResponse(costAsString);
    }

}
