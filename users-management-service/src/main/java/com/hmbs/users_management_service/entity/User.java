package com.hmbs.users_management_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Long designationId;
    private String role;
    private boolean isActive;
    private Long hotelId;
    private Long locationId;
}
