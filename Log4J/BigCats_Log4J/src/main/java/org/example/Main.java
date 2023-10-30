package org.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.model.Lion;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        BasicConfigurator.configure();

        Lion lion = new Lion();
        lion.setName("Simba");
        lion.setAge(4);
        lion.setAlpha(true);
        lion.run();

        try {
            lion.biggerThan10();
        }catch (Exception e){
         logger.error("A idade do leão "+ lion.getName() +" esta incorreta"+" error: "+e);
        }
    }
}