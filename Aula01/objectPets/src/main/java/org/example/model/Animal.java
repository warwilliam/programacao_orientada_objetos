package org.example.model;

public class Animal {

    String type;
    String name;
    int age;
    String foodDay;
    String noise;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public String getFoodDay() {
        return foodDay;
    }

    public void setFoodDay(String foodDay) {
        this.foodDay = foodDay;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public Animal(String type, String name, int age, String foodDay, String noise) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.foodDay = foodDay;
        this.noise = noise;
    }
}
