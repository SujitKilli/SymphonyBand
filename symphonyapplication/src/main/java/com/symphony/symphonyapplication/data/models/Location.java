package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Data
@Entity
@Table(name = "location")
public class Location {

    @Id
    @Column(name = "Loc_id")
    private int loc_id;


    @Column(name = "Location_name")
    @NotNull
    private String location_name;
}
