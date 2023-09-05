package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class UserObservable {

    private String name;
    private String LastName;

    private List<FollowerObserver> followers = new ArrayList<>();




    public void addFollower(FollowerObserver follower){
        this.followers.add(follower);

    }

    public void removeFollower(FollowerObserver follower){
        followers.remove(follower);
    }

    public void notification(){
        for (FollowerObserver follower : followers){
            System.out.println("Olá usuario: "+follower.getName()+ " Foi adicionado uma nova foto no perfil de: "+name);
            follower.counterNotification();
        }
    }



    public void addPhoto(){
        System.out.println("Usuario: "+name+" adicionou uma foto");
        notification();


    }


    protected UserObservable(String name, String lastName) {
        this.name = name;
        this.LastName = lastName;
    }
}
