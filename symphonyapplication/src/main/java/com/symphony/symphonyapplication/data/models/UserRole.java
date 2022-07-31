package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Data
@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @Column(name = "Role_id")
    private int role_id;


    @Column(name = "Role_Name")
    @NotNull
    private String role_name;

}
