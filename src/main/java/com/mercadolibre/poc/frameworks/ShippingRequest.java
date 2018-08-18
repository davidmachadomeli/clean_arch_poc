package com.mercadolibre.poc.frameworks;

public class ShippingRequest {

    public String userId;
    public String itemId;

    public ShippingRequest(String userId, String itemId) {
        this.userId = userId;
        this.itemId = itemId;
    }

}
