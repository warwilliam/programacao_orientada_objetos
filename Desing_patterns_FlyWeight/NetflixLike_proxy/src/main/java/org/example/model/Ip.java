package org.example.model;

public class Ip {

    private int[] numbers = new int[4];

    public Ip(int n0, int n1,int n2, int n3){
        this.numbers[0] = n0;
        this.numbers[1] = n1;
        this.numbers[2] = n2;
        this.numbers[3] = n3;
    }

    @Override
    public String toString(){
        return "IP{" +this.numbers[0] + "." +this.numbers[1] + "." +this.numbers[2] + "." +this.numbers[3];
    }

    public String getCountry(){
        String country = "";
        if (numbers[0] <= 49) {
            country = "Argentina";
        }
        if (numbers[0] <= 99 && numbers[0] >= 50){
            country = "Brasil";
        }
        if (numbers[0] <= 149 && numbers[0] >= 100){
            country = "Colombia";
        }
        return country;
    }

}
