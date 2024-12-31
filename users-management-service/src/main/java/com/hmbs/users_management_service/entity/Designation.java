package com.hmbs.users_management_service.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Designation {
    @Id
    private int id;

    private String name;
}
