package com.example.cp3566project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    private String courseName;
    private String courseNumber;
    private Integer capacity;
    private Integer year;
    private String semester;
    private Long pid;

    public Course() {}

    public Long getCourseId() { return courseId; }
    public void setCourseId(Long courseId) { this.courseId = courseId; }
    // ... existing getters and setters ...
    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }
    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
    public Long getPid() { return pid; }
    public void setPid(Long pid) { this.pid = pid; }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseNumber='" + courseNumber + '\'' +
                ", capacity=" + capacity +
                ", year=" + year +
                ", semester='" + semester + '\'' +
                ", pid=" + pid +
                '}';
    }
}
