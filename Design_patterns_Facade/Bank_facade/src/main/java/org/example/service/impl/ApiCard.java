package org.example.service.impl;

import org.example.models.Card;

public class ApiCard {

    public int disccount(Card card){
        if (card.getBank().compareToIgnoreCase("Star bank") == 0){
            return 20;
        } else {
            return 0;
        }
    }

}
