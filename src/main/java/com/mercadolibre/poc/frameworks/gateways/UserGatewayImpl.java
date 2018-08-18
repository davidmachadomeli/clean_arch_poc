package com.mercadolibre.poc.frameworks.gateways;

import com.mercadolibre.poc.adapters.gateways.UserGateway;
import com.mercadolibre.poc.entities.User;

public class UserGatewayImpl implements UserGateway {

    /*
     *    HERE WE CAN CALL TO A DB
     *    OR AN API
     *    OR A FILE SYSTEM
     *    OR WHATEVER YOU WANT !!
     */
    @Override
    public User getUserById(String userId) {
        return new User(2);
    }

}
