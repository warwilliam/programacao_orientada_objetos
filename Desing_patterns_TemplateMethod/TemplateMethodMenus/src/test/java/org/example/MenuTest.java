package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {


    AdultMenu adultMenu = new AdultMenu(150.50);

    KidsMenu kidsMenu = new KidsMenu(85,50);

    VegMenu vegMenu = new VegMenu(140);

    @Test
    public void adultTest(){
        adultMenu.assempleMenu();
       adultMenu.calcSellPrice();
    }

    @Test
    public void kidsTest(){
        kidsMenu.assempleMenu();
        kidsMenu.calcSellPrice();
    }

    @Test
    public void vegTest(){
        vegMenu.assempleMenu();
        vegMenu.calcSellPrice();
    }



}