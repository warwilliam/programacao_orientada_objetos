package org.example;

public class Container {

    protected int numberId ;
    protected String CountryOrigin;
    protected boolean danger;

    @Override
    public String toString() {
        return "Container{" +
                "numberId=" + numberId +
                ", CountryOrigin='" + CountryOrigin + '\'' +
                ", danger=" + danger +
                '}';
    }

    public Container(int numberId, String countryOrigin, boolean danger) {
        this.numberId = numberId;
        CountryOrigin = countryOrigin;
        this.danger = danger;
    }

    public int getNumberId() {
        return numberId;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public String getCountryOrigin() {
        return CountryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        CountryOrigin = countryOrigin;
    }

    public boolean isDanger() {
        return danger;
    }

    public void setDanger(boolean danger) {
        this.danger = danger;
    }
}
