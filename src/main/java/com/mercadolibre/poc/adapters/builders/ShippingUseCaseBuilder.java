package com.mercadolibre.poc.adapters.builders;

import com.mercadolibre.poc.adapters.gateways.ItemGateway;
import com.mercadolibre.poc.adapters.gateways.UserGateway;
import com.mercadolibre.poc.adapters.presenters.ShippingPresenter;
import com.mercadolibre.poc.entities.Item;
import com.mercadolibre.poc.entities.User;
import com.mercadolibre.poc.integration.use_cases.ShippingUseCase;

public class ShippingUseCaseBuilder {

    private ItemGateway itemGateway;
    private UserGateway userGateway;

    protected User user;
    protected Item item;

    public ShippingUseCaseBuilder withUserId(String userId) {
        this.user = this.userGateway.getUserById(userId);
        return this;
    }

    public ShippingUseCaseBuilder withItemId(String itemId) {
        this.item = this.itemGateway.getItemById(itemId);
        return this;
    }

    public ShippingUseCaseBuilder withItemGateway(ItemGateway gateway) {
        this.itemGateway = gateway;
        return this;
    }

    public ShippingUseCaseBuilder withUserGateway(UserGateway userGateway) {
        this.userGateway = userGateway;
        return this;
    }

    public ShippingUseCase build() {
        return new ShippingUseCase(
                this.item,
                this.user,
                new ShippingPresenter()
        );
    }
}
