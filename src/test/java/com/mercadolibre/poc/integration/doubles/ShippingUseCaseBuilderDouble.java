package com.mercadolibre.poc.integration.doubles;

import com.mercadolibre.poc.adapters.builders.ShippingUseCaseBuilder;
import com.mercadolibre.poc.integration.use_cases.ShippingUseCase;

public class ShippingUseCaseBuilderDouble extends ShippingUseCaseBuilder {

    @Override
    public ShippingUseCase build() {
        return new ShippingUseCaseDouble(item, user, new ShippingPresenterDouble());
    }

}
