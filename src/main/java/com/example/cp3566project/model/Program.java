package com.example.cp3566project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "programs")
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    private String programName;
    private String campus;

    public Long getPid() { return pid; }
    public void setPid(Long pid) { this.pid = pid; }

    public String getProgramName() { return programName; }
    public void setProgramName(String programName) { this.programName = programName; }

    public String getCampus() { return campus; }
    public void setCampus(String campus) { this.campus = campus; }

}
