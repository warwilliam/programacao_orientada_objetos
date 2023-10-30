package com.example.college.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String discipline;
    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
    private Set<Student> students = new HashSet<>();

    public Teacher() {
    }

    public Teacher(String name, String discipline, Set<Student> students) {
        this.name = name;
        this.discipline = discipline;
        this.students = students;
    }

    public Teacher(Integer id, String name, String discipline, Set<Student> students) {
        this.id = id;
        this.name = name;
        this.discipline = discipline;
        this.students = students;
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

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
