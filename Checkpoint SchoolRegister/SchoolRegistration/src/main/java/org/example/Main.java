package org.example;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course informatic = new Course();
        informatic.setCourseName("Informatica");
        informatic.setPrice(800.0d);

        Course english = new Course();
        informatic.setCourseName("Ingles");
        informatic.setPrice(700.0d);

        Course Admin = new Course();
        informatic.setCourseName("Adminitração");
        informatic.setPrice(850.0d);

        Adress adress =  new Adress();
        adress.setCep("13060-021");
        adress.setCity("Campinas");
        adress.setNeighborhood("Champs Elise");
        adress.setNumber(1111);
        adress.setState("São Paulo");


        Teacher teacher = new Teacher();
        teacher.setName("Gleysson");
        teacher.setCpf(123456789);
        teacher.setPhoneNumber("199924211");
        teacher.setPriceHour(150.0d);
        teacher.setEmail("warwdhbsd@gmail.com");
        teacher.setTraining(Training.DOCTOR);
        teacher.setAdress(adress);

        Student william = new Student();
        william.setAdress(adress);
        william.setCpf(1244566);
        william.setName("William");
        william.setEmail("wosdkodkfso@bol.com");

        Student Antonio = new Student();
        Antonio.setAdress(adress);
        Antonio.setCpf(1244566);
        Antonio.setName("Antonio");
        Antonio.setEmail("wosdkodkfso@bol.com");



        StudentClass classInformatic = new StudentClass();
        classInformatic.setRegisteredStudents(new ArrayList<>());
        classInformatic.setClassName("Sala Info01");
        classInformatic.setShift(Shift.M);
        classInformatic.setTeacher(teacher);
        classInformatic.addStudent(Antonio);
        classInformatic.addStudent(william);

        classInformatic.printInfo();

    }
}