package com.hmbs.hotel_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "room")
public class Room extends BaseEntity {

    private String roomNo;
    private String type;
    private long basePrice;
    private boolean isActive;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RoomFacilityMapping> roomFacilityMappings;

}
