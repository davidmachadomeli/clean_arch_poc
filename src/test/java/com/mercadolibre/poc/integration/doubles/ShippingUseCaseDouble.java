package com.mercadolibre.poc.integration.doubles;

import com.mercadolibre.poc.entities.Item;
import com.mercadolibre.poc.entities.ShippingCost;
import com.mercadolibre.poc.entities.User;
import com.mercadolibre.poc.integration.use_cases.ShippingUseCase;
import com.mercadolibre.poc.integration.use_cases.presenters.Presenter;
import com.mercadolibre.poc.integration.use_cases.responses.UseCaseResponse;

import static com.mercadolibre.poc.entities.ShippingCost.NOT_FREE;

public class ShippingUseCaseDouble extends ShippingUseCase {

    public ShippingUseCaseDouble(Item item, User user, Presenter<ShippingCost> presenter) {
        super(item, user, presenter);
    }

    @Override
    public UseCaseResponse doWork() {
        return new ShippingUseCaseResponseDouble(NOT_FREE);
    }

}
