package br.com.war.war_ecommerce.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;


@Table
@Entity
public class Categories implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    //Temestamps automaticos
    @Column(columnDefinition = "TIMESTAMP")
    private Instant created;
    @Column(columnDefinition = "TIMESTAMP")
    private Instant updated;

    @PrePersist
    public void BeforeSave(){
        created = Instant.now();
    }

    @PreUpdate
    public void BeforeUpdate(){
        updated =  Instant.now();
    }

    public Categories() {
    }

    public Categories(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Categories(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getCreated() {
        return created;
    }

    public Instant getUpdated() {
        return updated;
    }
}
