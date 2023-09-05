package org.example;

public class FollowerObserver {


    private String name;
    private String LastName;

    private int numNotifications = 0;

    public FollowerObserver(String name, String lastName) {
        this.name = name;
        this.LastName = lastName;
    }

    public void counterNotification(){
        numNotifications++ ;
    }

    public void visualizedNotification(){
        numNotifications-- ;
    }

    public void  getNumNotifications(){
        System.out.println(numNotifications);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
