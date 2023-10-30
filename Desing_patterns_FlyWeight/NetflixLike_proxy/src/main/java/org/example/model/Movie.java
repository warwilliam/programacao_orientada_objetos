package org.example.model;

import java.util.ArrayList;

public class Movie {

    private String title;
    private String country;
    private String link;

    private ArrayList<Integer> ip = new ArrayList<>();

    public Movie(String title, String country, String link) {
        this.title = title;
        this.country = country;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Integer> getIp() {
        return ip;
    }

    public void setIp(ArrayList<Integer> ip) {
        this.ip = ip;
    }
}
