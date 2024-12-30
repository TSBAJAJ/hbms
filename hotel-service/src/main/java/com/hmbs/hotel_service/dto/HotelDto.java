package com.hmbs.hotel_service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HotelDto {
    private Long id;
    private String name;
    private String code;

    private long createdOn;
    private long updatedOn;

    private String createdBy;
    private String updatedBy;

    private boolean isActive;

}
