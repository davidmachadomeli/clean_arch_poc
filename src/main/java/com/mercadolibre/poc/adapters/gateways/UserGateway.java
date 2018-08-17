package com.mercadolibre.poc.adapters.gateways;

import com.mercadolibre.poc.entities.User;

public interface UserGateway {

    User getUserById(String userId);

}
