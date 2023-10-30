package org.example.service.impl;

public class ApiQuantity {

    public int discount(int quantity){
        if (quantity >10){
            return 15;
        }
        return 0;
    }

}
