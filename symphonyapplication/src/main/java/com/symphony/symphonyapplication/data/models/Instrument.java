package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "instrument")
public class Instrument {

    @Id
    @Column(name = "Instrument_id")
    private int instrument_id;

    @Column(name = "Instrument_Name")
    @NotNull
    private String instrument_Name;
}
