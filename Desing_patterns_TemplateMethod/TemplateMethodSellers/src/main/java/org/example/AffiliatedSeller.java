package org.example;

public class AffiliatedSeller extends Seller{
    public AffiliatedSeller(String name, int sales) {
        super(name, sales);
        super.pointsOfSell = 15;
    }

    @Override
    public int calcPoints() {
        return this.sales * pointsOfSell;
    }

}
