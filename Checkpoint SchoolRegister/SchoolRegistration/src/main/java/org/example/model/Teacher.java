package org.example.model;

public class Teacher extends Person{

    Training training;

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    private double priceHour;


    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "training=" + training +
                ", priceHour=" + priceHour +
                '}';
    }
}
