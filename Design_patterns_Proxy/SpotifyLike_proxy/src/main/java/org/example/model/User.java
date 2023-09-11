package org.example.model;

import org.w3c.dom.ls.LSOutput;

public class User {

    private String userName;
    private boolean premium;

    public User(String userName, boolean premium) {
        this.userName = userName;
        this.premium = premium;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public String upToPremium(){
        this.premium = true;
        return "Agora vc possui uma conta premium" ;
    }
}
