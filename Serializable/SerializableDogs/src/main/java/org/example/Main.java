package org.example;

import org.example.model.Dog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Dog> dogs = new ArrayList<>();

        Dog dog = new Dog();
        dog.setName("Cherie");
        dog.setAddress("Rua manoel 88");
        dog.setRace("Yorkshire");
        dog.setAge(11);

        Dog dog1 = new Dog("Pink", "Rua 8",7,"Pintcher");

        //Save collection on file
        FileOutputStream fo = null;

        try {

            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(dogs);


        } catch (IOException e) {
            System.out.println("erro: "+e);;
        } catch (Exception e){
            System.out.println("erro: "+e);
        }

        //Get and read data on file "OutputFile.txt"

        List<Dog> cachorrosIn = null;
        FileInputStream fi =null;

        try{
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            cachorrosIn = (ArrayList)ois.readObject();

        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Dog c: cachorrosIn
        ) {
            System.out.println(c.getName());
        }



    }
}