package org.example.model;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tiger {

    private static final Logger logger = LogManager.getLogger(Tiger.class);

    private String name;
    private int age;


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





    public void run(){
        logger.info("O Tigre " + name + " esta correndo");
    }

    public void biggerThan10() throws Exception {
        if (age > 10){
            logger.info("O Tigre "+ name + " tem mais de 10 anos");
        }
        if (age < 0){
            logger.error("A idade não pode ser nagativa");
            throw new Exception();
        }
    }

}
