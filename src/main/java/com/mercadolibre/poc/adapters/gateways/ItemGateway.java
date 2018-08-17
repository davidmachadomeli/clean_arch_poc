package com.mercadolibre.poc.adapters.gateways;

import com.mercadolibre.poc.entities.Item;

public interface ItemGateway {

    Item getItemById(String itemId);

}
