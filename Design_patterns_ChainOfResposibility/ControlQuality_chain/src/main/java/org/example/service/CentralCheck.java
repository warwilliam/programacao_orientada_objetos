package org.example.service;

import org.example.model.Product;
import org.example.service.impl.CheckBatch;
import org.example.service.impl.CheckPack;
import org.example.service.impl.CheckWeight;

public class CentralCheck {

    ControlBegin controlBegin;

    public CentralCheck(){
        this.controlBegin = new CheckBatch();
        ControlBegin weight = new CheckWeight();
        ControlBegin pack = new CheckPack();

        controlBegin.setNextStep(weight);
        weight.setNextStep(pack);

    }

    public void check(Product product){
        controlBegin.check(product);
    }


}
