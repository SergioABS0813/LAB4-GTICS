package com.example.lab4.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "regions")
public class Regions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id", nullable = false)
    private Integer regionId;

    @Column(name = "region_name", nullable = false)
    private String regionName;


}
