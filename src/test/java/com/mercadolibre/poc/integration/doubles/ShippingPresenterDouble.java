package com.mercadolibre.poc.integration.doubles;

import com.mercadolibre.poc.entities.ShippingCost;
import com.mercadolibre.poc.useCases.presenters.Presenter;
import com.mercadolibre.poc.useCases.responses.UseCaseResponse;

public class ShippingPresenterDouble implements Presenter<ShippingCost> {

    @Override
    public UseCaseResponse present(ShippingCost cost) {
        return new ShippingUseCaseResponseDouble(cost);
    }


}
