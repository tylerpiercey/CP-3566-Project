package com.example.cp3566project.repository;

import com.example.cp3566project.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // Additional custom methods can be defined here
}