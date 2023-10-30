package org.example.service.impl;

import org.example.models.Card;
import org.example.models.Product;

public class ApiProduct {

    public int disccount(Product product){
        if (product.getType().compareToIgnoreCase("lata") == 0){
            return 10;
        } else {
            return 0;
        }
    }

}
