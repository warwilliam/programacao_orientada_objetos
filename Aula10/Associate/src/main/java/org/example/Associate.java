package org.example;

public class Associate {

    protected String numAssociate ;
    protected String name ;

    protected double monthValue;
    protected String activity;

    public Associate(String numAssociate, String name, double monthValue, String activity) {
        this.numAssociate = numAssociate;
        this.name = name;
        this.monthValue = monthValue;
        this.activity = activity;
    }

    public double MonthCost() {
        return 0;
    }
}
