package com.hmbs.users_management_service.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RolesPermissionsMapping extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false) // Custom foreign key for Role
    private Role role;

    @ManyToOne
    @JoinColumn(name = "permission_id", nullable = false) // Custom foreign key for Permission
    private Permission permission;
}
