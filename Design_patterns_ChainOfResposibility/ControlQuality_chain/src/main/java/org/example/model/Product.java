package org.example.model;

public class Product {

    private int batch;
    private int weight;
    private String pack;

    protected int scoreQuality = 0;

    public int getScoreQuality() {
        return scoreQuality;
    }

    public void setScoreQuality(int scoreQuality) {
        this.scoreQuality = scoreQuality;
    }


    public Product(int batch, int weight, String pack) {
        this.batch = batch;
        this.weight = weight;
        this.pack = pack;
        this.scoreQuality = 0;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch() {
        this.batch = batch;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }
}
