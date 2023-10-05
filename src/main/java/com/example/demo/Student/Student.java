package com.example.demo.Student;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private Integer age;
    private LocalDate dov;
    private String email;

    public Student(Long id, String name,Integer age, LocalDate dov, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dov = dov;
        this.email = email;
    }

    public Student(String name, Integer age, LocalDate dov, String email) {
        this.name = name;
        this.age = age;
        this.dov = dov;
        this.email = email;
    }

    public Student() {

    }

    public Long getId() {
        return id;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDov() {
        return dov;
    }

    public void setDov(LocalDate dov) {
        this.dov = dov;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dov=" + dov +
                ", email='" + email + '\'' +
                '}';
    }
}
