package org.example.service;

import org.example.model.Product;

public abstract class ControlBegin {


    protected ControlBegin nextStep;

    public ControlBegin getNextStep(){
        return this.nextStep;
    }

    public void setNextStep(ControlBegin control){
        this.nextStep = control;
    }

    public abstract void check(Product product);

}
