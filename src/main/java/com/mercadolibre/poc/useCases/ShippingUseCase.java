package com.mercadolibre.poc.useCases;

import com.mercadolibre.poc.adapters.UseCase;
import com.mercadolibre.poc.adapters.gateways.ItemGateway;
import com.mercadolibre.poc.adapters.gateways.UserGateway;
import com.mercadolibre.poc.entities.Item;
import com.mercadolibre.poc.entities.ShippingCost;
import com.mercadolibre.poc.entities.User;
import com.mercadolibre.poc.useCases.presenters.Presenter;
import com.mercadolibre.poc.useCases.responses.UseCaseResponse;

import static com.mercadolibre.poc.entities.ShippingCost.FREE;
import static com.mercadolibre.poc.entities.ShippingCost.NOT_FREE;

public class ShippingUseCase implements UseCase<UseCaseResponse> {

    private Presenter<ShippingCost> presenter;

    private ItemGateway itemGateway;
    private UserGateway userGateway;

    private Item item;
    private User user;

    public ShippingUseCase(Item item, User user, Presenter<ShippingCost> presenter) {
        this.item = item;
        this.user = user;

        this.presenter = presenter;
    }

    @Override
    public UseCaseResponse doWork() {
        ShippingCost cost = NOT_FREE;

        if (this.user.getLoyaltyLevel() == 2 && item.getPrice() > 1200) {
            cost = FREE;
        } else {
            cost = this.shippingGateway(user, item);
        }

        return this.presenter.present(cost);
    }

}
