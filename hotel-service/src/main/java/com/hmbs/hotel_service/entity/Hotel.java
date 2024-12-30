package com.hmbs.hotel_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Hotel extends BaseEntity {

    private String name;
    private String code;
    private boolean isActive;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    private Location id;
}
