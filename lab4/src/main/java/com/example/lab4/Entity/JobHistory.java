package com.example.lab4.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "job_history")
public class JobHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_history_id", nullable = false)
    private Integer JobHistoryId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "end_date", nullable = false)
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments departments;





}
