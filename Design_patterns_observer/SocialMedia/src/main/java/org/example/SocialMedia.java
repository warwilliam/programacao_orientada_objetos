package org.example;

public class SocialMedia {
    public static void main(String[] args) {
        UserObservable user = new UserObservable("William", "Rodrigues");
        FollowerObserver follower = new FollowerObserver("Zé","Stalker");
        FollowerObserver follower2 = new FollowerObserver("João","Zoio");
        user.addFollower(follower);
        user.addFollower(follower2);
        user.addPhoto();
        user.addPhoto();
        follower.getNumNotifications();
        follower2.getNumNotifications();
        follower.visualizedNotification();
        follower.getNumNotifications();
    }
}