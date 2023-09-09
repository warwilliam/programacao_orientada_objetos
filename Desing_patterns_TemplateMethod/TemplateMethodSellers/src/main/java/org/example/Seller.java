package org.example;

public abstract class Seller {

    protected String name;
    protected int sales;
    protected int pointsOfSell;

    public Seller(String name, int sales) {
        this.name = name;
        this.sales = sales;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getPointsOfSell() {
        return pointsOfSell;
    }

    public void setPointsOfSell(int pointsOfSell) {
        this.pointsOfSell = pointsOfSell;
    }

    public void sell(int amountSales){
        this.sales  += amountSales;
        System.out.println(this.name+" realizou "+ amountSales + " vendas" );
    }

    public  void addAffiliated(Seller affilied){}


    public abstract int calcPoints();

    public String showRank(){
        String rank = "";
     if (calcPoints() <= 20)
         rank = "novato";
     if (calcPoints() > 20 && calcPoints() <31)
         rank = "aprendiz";
     if (calcPoints() >30 && calcPoints() < 41)
         rank = "Bom";
     if (calcPoints() >40)
         rank = "Mestre";
        return rank;
    }

}
