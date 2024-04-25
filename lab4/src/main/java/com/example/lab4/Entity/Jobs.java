package com.example.lab4.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "jobs")
public class Jobs {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id", nullable = false)
    private String jobId;

    @Column(name = "job_title", nullable = false)
    private String jobTitle;

    @Column(name = "min_salary", nullable = false)
    private Integer minSalary;

    @Column(name = "max_salary", nullable = false)
    private Integer maxSalary;





}
