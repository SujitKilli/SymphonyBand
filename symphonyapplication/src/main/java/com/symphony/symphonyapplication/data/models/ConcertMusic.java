package com.symphony.symphonyapplication.data.models;

import com.symphony.symphonyapplication.data.utils.ConcertMusicID;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@IdClass(ConcertMusicID.class)
@Table(name = "concertmusicmapping")
public class ConcertMusic {

    @Id
    @Column(name = "Type_id")
    private int typeid;

    @Id
    @Column(name = "Music_id")
    private int musicid;

    @Column(name = "Concert_type")
    private String concerttype;

    @Column(name = "Music_type")
    private String musictype;
}
