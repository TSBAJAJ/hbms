package com.hmbs.hotel_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Location extends BaseEntity {

    private String address1;
    private String address2;
    private String city;
    private String pin;
    private String state;
    private String country;
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

}
