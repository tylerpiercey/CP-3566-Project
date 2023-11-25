package com.example.cp3566project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students") // This tells Hibernate to make a table out of this class
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String postal;
    private String phone;

    // Constructors, Getters, and Setters will go here
}
