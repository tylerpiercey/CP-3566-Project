package com.example.cp3566project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses") // This tells Hibernate to make a table out of this class
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String courseName;
    private String courseNumber;
    private Integer capacity;

    // Constructors, Getters, and Setters will go here
}
