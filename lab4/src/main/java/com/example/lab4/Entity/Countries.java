package com.example.lab4.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id", nullable = false)
    private String countryId;

    @Column(name = "country_name", nullable = false)
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Regions regionsId;

}
