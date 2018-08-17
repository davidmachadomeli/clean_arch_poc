package com.mercadolibre.poc.integration.doubles;

import com.mercadolibre.poc.entities.ShippingCost;
import com.mercadolibre.poc.integration.use_cases.presenters.Presenter;
import com.mercadolibre.poc.integration.use_cases.responses.UseCaseResponse;

public class ShippingPresenterDouble implements Presenter<ShippingCost> {

    @Override
    public UseCaseResponse present(ShippingCost cost) {
        return new ShippingUseCaseResponseDouble(cost);
    }


}
