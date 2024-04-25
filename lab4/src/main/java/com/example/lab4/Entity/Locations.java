package com.example.lab4.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "locations")
public class Locations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id", nullable = false)
    private Integer locationId;

    @Column(name = "street_address", nullable = false)
    private String streetAdrress;

    @Column(name = "postal_code", nullable = false)
    private String postalCode;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state_province", nullable = false)
    private String stateProvince;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private Countries countryId;








}
