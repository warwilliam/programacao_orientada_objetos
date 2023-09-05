package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {

    private String className;
    private Teacher teacher;

    private List<Student> registeredStudents;
    private Shift shift;

    public StudentClass() {

    }

    public List<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public void setRegisteredStudents(List<Student> registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public void addStudent(Student student){
        this.registeredStudents.add(student);
        for (Student student1 : registeredStudents){
            student.setIdStudent(registeredStudents.size()+1);
        }
    }

    public void printInfo(){
        for (Student student : registeredStudents){
            System.out.println("O aluno "+student.getName()+" com o id "+student.getIdStudent() + "esta na turma "+getClassName());
        }
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    @Override
    public String toString() {
        return "StudentClass{" +
                "className='" + className + '\'' +
                ", teacher=" + teacher +
                ", registeredStudents=" + registeredStudents +
                ", shift=" + shift +
                '}';
    }
}
