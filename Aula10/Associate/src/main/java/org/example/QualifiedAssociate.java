package org.example;

public class QualifiedAssociate  extends  Associate{

    protected double poolCost;
    protected boolean qualified;

    public QualifiedAssociate(String numAssociate, String name, double monthValue, String activity, double poolCost, boolean qualified) {
        super(numAssociate, name, monthValue, activity);
        this.poolCost = poolCost;
        this.qualified = qualified;
    }

    public void setPoolCost(double poolCost) {
        this.poolCost = poolCost;
    }

    public void setQualified(boolean qualified) {
        this.qualified = qualified;
    }


    public double getPoolCost() {
        return poolCost;
    }

    public boolean isQualified() {
        return qualified;
    }

    @Override
    public double MonthCost() {
        if( qualified =  false){
            monthValue = monthValue;
        }
        else {
            monthValue = monthValue + poolCost;
        }
       return monthValue;
    }
}
