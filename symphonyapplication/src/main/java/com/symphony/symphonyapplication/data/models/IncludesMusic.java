package com.symphony.symphonyapplication.data.models;

import com.symphony.symphonyapplication.data.utils.IncludesMusicid;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@IdClass(IncludesMusicid.class)
@Table(name = "includes_music")
public class IncludesMusic {
    @Id
    @Column(name = "Type_id")
    private int type_id;

    @Id
    @Column(name = "Music_id")
    private int music_id;
}
