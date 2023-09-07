package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    Person p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    List<String> collection = new ArrayList<String>();

    @BeforeEach
    void doBefore(){
        p1 = new Person("William","Rodrigues");
        p2 = new Person("ZE","silva");
        p3 = new Person("Maria","Oliveira");
        p4 = new Person("Ton","Gues");
        p5 = new Person("Alex","Rizzo");
        p6 = new Person("Beto","Jr");
        p7 = new Person("Ivo","Rod");
        p8 = new Person("Will","Turner");
        p9 = new Person("Mau","Fatio");
        p10 = new Person("Gil","Rugai");
        p1.setAge(LocalDate.of(2002,9,9));
        p2.setAge(LocalDate.of(2003,9,9));
        p3.setAge(LocalDate.of(2004,9,9));
        p4.setAge(LocalDate.of(2005,9,9));
        p5.setAge(LocalDate.of(2006,9,9));
        p6.setAge(LocalDate.of(2007,9,9));
        p7.setAge(LocalDate.of(2008,9,9));
        p8.setAge(LocalDate.of(2000,9,9));
        p9.setAge(LocalDate.of(2010,9,9));
        p10.setAge(LocalDate.of(2011,9,9));
    }

    @Test
    void printObjects(){
        System.out.println(p1);
    }

    @Test
    void testAddPerson(){
        p1.addPessoal(p1);
        p2.addPessoal(p2);
        p3.addPessoal(p3);
        p4.addPessoal(p4);
        p5.addPessoal(p5);
        p6.addPessoal(p6);
        p7.addPessoal(p7);
        p8.addPessoal(p8);
        p9.addPessoal(p9);
        p10.addPessoal(p10);
    }

}
