package org.example.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lion {

    private static final Logger logger = LogManager.getLogger(Lion.class);



    private String name;
    private int age;
    private boolean alpha;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlpha() {
        return alpha;
    }

    public void setAlpha(boolean alpha) {
        this.alpha = alpha;
    }

    public void run(){
        logger.info("O leão " + name + " esta correndo");
    }

    public void biggerThan10() throws Exception {
        if (age > 10 && isAlpha()){
            logger.info("O leão "+ name + " tem mais de 10 anos e é alfa");
        }
        if (age < 0){
            logger.error("A idade não pode ser nagativa");
            throw new Exception();
        }
    }

}
