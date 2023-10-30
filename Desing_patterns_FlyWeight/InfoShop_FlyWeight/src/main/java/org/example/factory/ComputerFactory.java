package org.example.factory;

import org.example.model.Computer;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {

    private static Map<String, Computer> macFlyWeight = new HashMap<>();

    public Computer getComputer(int ram, int hd) {
        String comp = "Comp: "+ ram + " : "+hd;
        System.out.println(comp);
        if(!macFlyWeight.containsKey(comp)){
            macFlyWeight.put(comp, new Computer(ram, hd));
            System.out.println("novo pc criado");
            return macFlyWeight.get(comp);
        }else {
            System.out.println("Computador ja existe e foi obtido");
            return macFlyWeight.get(comp);
        }
    }
}
