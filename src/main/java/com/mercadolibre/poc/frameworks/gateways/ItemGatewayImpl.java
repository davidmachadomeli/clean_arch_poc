package com.mercadolibre.poc.frameworks.gateways;

import com.mercadolibre.poc.adapters.gateways.ItemGateway;
import com.mercadolibre.poc.entities.Item;

public class ItemGatewayImpl implements ItemGateway {

    /*
     *    HERE WE CAN CALL TO A DB
     *    OR AN API
     *    OR A FILE SYSTEM
     *    OR WHATEVER YOU WANT !!
     */
    @Override
    public Item getItemById(String itemId) {
        return new Item(1400);
    }

}
