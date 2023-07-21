package org.example.model;

public class Player {

    private String name;
    private String nickname;
    private int score;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Player(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public void upScore(int point) {
        this.score += point;
    }

    public void upLevel(int xp){
        this.level += xp;
    }
    public void upBonus(int point){
        this.score += point;
    }

}
