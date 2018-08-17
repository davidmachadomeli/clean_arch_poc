package com.mercadolibre.poc.integration.frameworks;

import com.mercadolibre.poc.integration.doubles.ShippingUseCaseBuilderDouble;
import com.mercadolibre.poc.integration.frameworks.controllers.ShippingController;
import com.mercadolibre.poc.integration.frameworks.gateways.ItemGatewayImpl;
import com.mercadolibre.poc.integration.frameworks.gateways.UserGatewayImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrameworksTest {

    private ShippingController controller;

    @Test
    public void controller_test() {
        //GIVEN
        final ShippingRequest req = new ShippingRequest("1", "1");

        this.controller = new ShippingController(
                new ShippingUseCaseBuilderDouble(),
                new ItemGatewayImpl(),
                new UserGatewayImpl()
        );

        // THEN
        assertEquals("NOT_FREE", this.controller.getShippingCost(req));
    }

}
