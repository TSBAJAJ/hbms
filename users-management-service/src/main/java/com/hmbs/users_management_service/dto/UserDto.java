package com.hmbs.users_management_service.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Long designationId;
    private String role;
    private boolean isActive;
    private Long hotelId;
    private Long locationId;
    private Long createdOn;
    private Long updatedOn;
    private String createdBy;
    private String updatedBy;
}
