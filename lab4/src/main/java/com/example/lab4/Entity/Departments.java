package com.example.lab4.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false)
    private Integer departmentId;

    @Column(name = "department_name", nullable = false)
    private String departmentName;

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    private Employees managerId;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Locations locationId;




}
