package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "concert_type")
public class ConcertType {

    @Id
    @Column(name = "Type_id")
    private int type_id;

    @Column(name = "Concert_type")
    @NotNull
    private String concert_type;

}
