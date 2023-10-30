package org.example.model;

public class Trip {

    private String departureDate;
    private String returnDate;
    private String origin;
    private String destiny;
    private String flyCompany;
    private String hotel;


    public Trip(String departureDate, String returnDate, String origin, String destiny) {
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.origin = origin;
        this.destiny = destiny;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getFlyCompany() {
        return flyCompany;
    }

    public void setFlyCompany(String flyCompany) {
        this.flyCompany = flyCompany;
    }

    public String getHotel() {
        return hotel;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "departureDate='" + departureDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", origin='" + origin + '\'' +
                ", destiny='" + destiny + '\'' +
                ", flyCompany='" + flyCompany + '\'' +
                ", hotel='" + hotel + '\'' +
                '}';
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
