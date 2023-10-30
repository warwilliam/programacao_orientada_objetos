package com.dh.comida;

import com.dh.comida.factory.ComidaFactory;
import com.dh.comida.model.Comida;

public class Main {
    public static void main(String[] args) {
        final ComidaFactory comida = new ComidaFactory();

        Comida comida1 = comida.getComida("Massas");
        comida1.setPreco(10000);

        final Comida comida2 = comida.getComida("Massas");
        System.out.println(comida2.toString());
    }
}
