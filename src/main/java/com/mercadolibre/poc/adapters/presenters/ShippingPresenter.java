package com.mercadolibre.poc.adapters.presenters;

import com.mercadolibre.poc.adapters.responses.ShippingUseCaseResponse;
import com.mercadolibre.poc.entities.ShippingCost;
import com.mercadolibre.poc.useCases.presenters.Presenter;
import com.mercadolibre.poc.useCases.responses.UseCaseResponse;

public class ShippingPresenter implements Presenter<ShippingCost> {

    @Override
    public UseCaseResponse present(ShippingCost cost) {
        final String costAsString = "cost : " + cost.toString().toLowerCase();
        return new ShippingUseCaseResponse(costAsString);
    }

}
