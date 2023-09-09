package org.example;

import java.util.ArrayList;

public class PermanentSeller extends Seller{

    protected int yearsXperience;

    protected ArrayList<Seller> affiliateds = new ArrayList<>();

    public PermanentSeller(String name, int sales, int yearsXperience) {
        super(name, sales);
        super.pointsOfSell = 5;
        this.yearsXperience = yearsXperience;
        this.affiliateds = new ArrayList<>();
    }


    public void addAffiliated(Seller affiliated) {
        this.affiliateds.add(affiliated);
        System.out.println("add new afiliado: "+affiliated.name+" ao vendedor: "+super.name);
    }



    @Override
    public int calcPoints() {
        return(this.affiliateds.size()*10 + this.yearsXperience*5 + pointsOfSell*sales);
    }

}
