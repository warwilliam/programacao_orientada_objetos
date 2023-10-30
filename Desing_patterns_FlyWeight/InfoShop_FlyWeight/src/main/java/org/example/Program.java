package org.example;

import org.example.factory.ComputerFactory;
import org.example.model.Computer;

public class Program {
    public static void main(String[] args) {

        ComputerFactory computerFactory = new ComputerFactory();
        Computer mac1 = computerFactory.getComputer(16, 500);
        Computer pcWin1 = computerFactory.getComputer(2,256);
        Computer mac2 = computerFactory.getComputer(16,500);
        Computer pcWin2 = computerFactory.getComputer(8,1000);
        Computer pcWin3 = computerFactory.getComputer(8,1000);

        System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(pcWin1.toString());

    }
}