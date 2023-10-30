package model;

public class Account {

    private int id;
    private String name;
    private String numbAccount;
    private double ammount;

    public Account() {
    }

    public Account(int id, String name, String numbAccount, double ammount) {
        this.id = id;
        this.name = name;
        this.numbAccount = numbAccount;
        this.ammount = ammount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumbAccount() {
        return numbAccount;
    }

    public void setNumbAccount(String numbAccount) {
        this.numbAccount = numbAccount;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
}
