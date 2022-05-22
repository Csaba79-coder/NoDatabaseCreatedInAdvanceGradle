package com.csaba79coder.nodatabasecreatedinadvancegradle.model;

import lombok.Data;

import javax.management.relation.Role;
import javax.persistence.*;

@Data
@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private Role role;

    public UserRole() {

    }

    public UserRole(Role role) {
        this.role = role;
    }
}