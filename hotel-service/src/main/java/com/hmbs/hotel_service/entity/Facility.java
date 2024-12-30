package com.hmbs.hotel_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "facility")
public class Facility extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "facility", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RoomFacilityMapping> roomFacilityMappings;
}
