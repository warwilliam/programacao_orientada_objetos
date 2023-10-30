package org.example.service;

import org.example.models.Card;
import org.example.models.Product;

public interface IFacadeDisccount {

    public int disccount(Card card, Product product, int quantity);

}
