package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {

    protected String name;
    protected String lastName;
    protected int age;

    protected List<Account> accounts = new ArrayList<>();

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getFullName(){
        return name+ " " + lastName;
    }

    public boolean isAdult(){
        if (age >= 18) {

            return true;
        }
        else return false;
    }

    public double sumTotalAccounts(ArrayList<Account> accounts){
        int i = 0;
        double sum = 0;
        for (Account account : accounts){
            sum += account.getAmount();
        }
        return sum;
    }



}
