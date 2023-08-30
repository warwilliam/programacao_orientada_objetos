package org.example;

public class Dog {

    private boolean able = false;
    private String race;

    private int birthYear;

    private int age;

    private double weightGrams;

    private boolean hasChip;

    private boolean healthy;

    private String name;

    public Dog( String race, int birthYear, double weightGrams, boolean hasChip, boolean healthy) {
        this.race = race;
        this.birthYear = birthYear;
        this.weightGrams = weightGrams;
        this.hasChip = hasChip;
        this.healthy = healthy;
    }

    public boolean ableCheck(boolean healthy, double weightGrams){
            if(healthy && weightGrams > 5000 )
                this.able = true;
            else able =false;
        return able;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int CheckAge(int year){
        this.age =2023;
        age -= this.birthYear;
        return age;
    }



    public boolean isAble() {
        return able;
    }

    public void setAble(boolean able) {
        this.able = able;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getBirthYear() {
        return birthYear;
    }



    public double getWeightGrams() {
        return weightGrams;
    }

    public void setWeightGrams(double weightGrams) {
        this.weightGrams = weightGrams;
    }

    public boolean isHasChip() {
        return hasChip;
    }

    public void setHasChip(boolean hasChip) {
        this.hasChip = hasChip;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
