package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String lastName;
    private LocalDate age;
    private List<String> collection =  new ArrayList<>();

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public List<String> getCollection() {
        return collection;
    }

    public void setCollection(List<String> collection) {
        this.collection = collection;
    }

    public List<String> addPessoal(Person p){
        int var = p.getName().length();
        int age = p.calcAge();

        if (var >= 5 && age >= 18){
            collection.add(p.getName());
            System.out.println(collection);
        }
            return null;
    }

    public int calcAge(){
        int age = Period.between(this.age, LocalDate.now()).getYears();
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", collection=" + collection +
                '}';
    }
}
