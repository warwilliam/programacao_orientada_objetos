package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArtAuction {

    private String iten;
    protected double price;

    private List<Bidder> bidders = new ArrayList<>();

    public void initAuction(double price, String iten){
        this.iten = iten;
        this.price = price;
        bittersNotification();
    }

    public void bittersNotification(){
        for (Bidder bidder : bidders){
            System.out.println("Olá licitante: "+bidder.getName()+" o leilão do iten: "+ iten +" iniciado no valor de: R$"+price);
            System.out.println("Gostaria de dar um lance? ");
        }
    }




    public ArtAuction(String iten, double price) {
        this.iten = iten;
        this.price = price;
    }

    public String getIten() {
        return iten;
    }

    public void setIten(String iten) {
        this.iten = iten;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Bidder> getBibbers() {
        return bidders;
    }

    public void setBibbers(List<Bidder> bibbers) {
        this.bidders = bibbers;
    }
}
