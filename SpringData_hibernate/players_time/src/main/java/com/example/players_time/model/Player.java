package com.example.players_time.model;


import jakarta.persistence.*;

@Table
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String position;
    private double weight;
    private double height;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "team_id")
    private Team team;

    public Player() {
    }

    public Player(String name, String position, double weight, double height) {
        this.name = name;
        this.position = position;
        this.weight = weight;
        this.height = height;

    }

    public Player(Long id, String name, String position, double weight, double height) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.weight = weight;
        this.height = height;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Long getId() {
        return id;
    }

}
