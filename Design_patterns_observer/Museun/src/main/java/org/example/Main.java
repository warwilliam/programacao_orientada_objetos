package org.example;

public class Main {
    public static void main(String[] args) {
        ArtAuction artAuction = new ArtAuction("Quadro Noite estralada de Van Gogh", 500000.00);
        Bidder bidder0 = new Bidder("William", 1000000000.00);
        Bidder bidder1 = new Bidder("Natalia", 10000.00);
        artAuction.getBibbers().add(bidder1);
        artAuction.getBibbers().add(bidder0);
        artAuction.bittersNotification();
        bidder0.takeBid(artAuction.getPrice(), 600);
        System.out.println(artAuction.getPrice());
    }
}