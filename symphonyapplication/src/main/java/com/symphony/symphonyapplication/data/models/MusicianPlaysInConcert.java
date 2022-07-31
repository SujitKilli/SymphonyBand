package com.symphony.symphonyapplication.data.models;

import com.symphony.symphonyapplication.data.utils.Musc_Con;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@IdClass(Musc_Con.class)
@Table(name = "musician_plays_in_concert")
public class MusicianPlaysInConcert {

    @Id
    @Column(name = "Musician_id")
    private String musician_id;

    @Id
    @Column(name = "Concert_id")
    private int concert_id;

}


