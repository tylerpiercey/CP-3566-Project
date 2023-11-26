package com.example.cp3566project.repository;

import com.example.cp3566project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can add custom methods if needed, for example:
    // List<Student> findByLastName(String lastName);
}
