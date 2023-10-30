package org.example.service.impl;

import org.example.models.Card;
import org.example.models.Product;
import org.example.service.IFacadeDisccount;

public class FacadeDisccount implements IFacadeDisccount {

    private ApiCard apiCard;
    private ApiProduct apiProduct;
    private ApiQuantity apiQuantity;

    public FacadeDisccount() {
        apiCard = new ApiCard();
        apiProduct = new ApiProduct();
        apiQuantity = new ApiQuantity();
    }

    @Override
    public int disccount(Card card, Product product, int quantity) {

        int disccount = 0;

        disccount += apiQuantity.discount(quantity);
        disccount += apiProduct.disccount(product);
        disccount += apiCard.disccount(card);

        return disccount;
    }
}
