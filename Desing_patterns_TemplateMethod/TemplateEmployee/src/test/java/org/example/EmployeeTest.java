package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void Calcs(){
        Employee func = new Permanet("Camel","Doe","64512-554",5500, 1000, 550);


        func.payDay();

        Employee func1 = new FreeLancer("Avulso","Da silva","17741",510.0,10);

        func.payDay();

    }

}