package com.hmbs.hotel_service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "room_facility_mapping")
public class RoomFacilityMapping extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false) // Custom foreign key for Room
    private Room room;

    @ManyToOne
    @JoinColumn(name = "facility_id", nullable = false) // Custom foreign key for Facility
    private Facility facility;

    private boolean isActive;

}
