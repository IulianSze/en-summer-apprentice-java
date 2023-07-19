package com.practica.PracticaJAVA.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer venueId;

    @Column(name = "Location")
    private String location;

    @Column(name = "Type")
    private String type;

    @Column(name = "Capacity")
    private Integer capacity;

    public Venue() {
    }

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
