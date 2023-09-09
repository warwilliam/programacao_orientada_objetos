package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    public void doBefore() {
        Seller seller = new PermanentSeller("Ze", 0, 5);
        seller.sell(10);
        Seller sellerNewbie = new PermanentSeller("Alex", 0, 0);
        sellerNewbie.sell(5);
        Seller affiliated = new AffiliatedSeller("Junior", 0);
        affiliated.sell(1);
        Seller affiliated2 = new AffiliatedSeller("Junior", 0);
        affiliated2.sell(3);
        seller.addAffiliated(affiliated);
        seller.addAffiliated(affiliated2);

        Trainee trainee = new Trainee("NewBie", 1);
        Trainee trainee1 = new Trainee("Enzo", 11);


        System.out.println("O vendedor " + seller.getName() + " possui  " + seller.calcPoints() + " pontos");
        System.out.println("E seu rank é: " + seller.showRank());
        System.out.println(sellerNewbie.showRank());
        System.out.println(affiliated.showRank());
        System.out.println(affiliated2.showRank());
        System.out.println("O vendedor " + trainee.getName() + " possui  " + trainee.calcPoints() + " pontos");
        System.out.println("E seu rank é: " + trainee.showRank());
        System.out.println("O vendedor " + trainee1.getName() + " possui  " + trainee1.calcPoints() + " pontos");
        System.out.println("E seu rank é: " + trainee1.showRank());

    }


}