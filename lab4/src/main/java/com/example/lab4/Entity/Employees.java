package com.example.lab4.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "hire_date")
    private Date hireDate;

    @Column(name = "job_id")
    private String jobId;

    @Column(name = "salary")
    private Float salary;

    @Column(name = "commission_pct")
    private Float commissionPct;

    @Column(name = "manager_id", nullable = false)
    private Integer managerId;

    @Column(name = "department_id", nullable = false)
    private Integer departmentId;

    @Column(name = "enabled", nullable = false)
    private Integer enabled;



















}
