package com.mercadolibre.poc.functional;

import com.mercadolibre.poc.adapters.builders.ShippingUseCaseBuilder;
import com.mercadolibre.poc.integration.frameworks.ShippingRequest;
import com.mercadolibre.poc.integration.frameworks.controllers.ShippingController;
import com.mercadolibre.poc.integration.frameworks.gateways.ItemGatewayImpl;
import com.mercadolibre.poc.integration.frameworks.gateways.UserGatewayImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E2ETests {

    private ShippingController controller;

    @Before
    public void setup() {
        this.controller = new ShippingController(
                new ShippingUseCaseBuilder(),
                new ItemGatewayImpl(),
                new UserGatewayImpl()
        );
    }

    @Test
    public void controller_test() {
        // EXPECT
        assertEquals(
                "cost : free",
                this.controller.getShippingCost(new ShippingRequest("1", "1"))
        );
    }

}
