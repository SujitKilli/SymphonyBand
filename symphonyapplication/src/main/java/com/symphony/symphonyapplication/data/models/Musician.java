package com.symphony.symphonyapplication.data.models;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Data
@Entity
@Table(name = "musician")

public class Musician {
    @Id
    @Column(name = "User_id")
    private String user_id;

    @Column(name = "Instrument_id")
    @NotNull
    private int instrument_id;

    @Column(name = "Manager_id")
    @NotNull
    private String manager_id;

}

