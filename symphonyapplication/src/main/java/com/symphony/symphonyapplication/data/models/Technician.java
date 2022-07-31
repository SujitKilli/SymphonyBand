package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "technician")
public class Technician {

    @Id
    @Column(name = "User_id")
    private String user_id;

    @Column(name = "Manager_id")
    @NotNull
    private String manager_id;
}