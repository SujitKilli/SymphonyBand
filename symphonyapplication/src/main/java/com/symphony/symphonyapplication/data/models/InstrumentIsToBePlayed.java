package com.symphony.symphonyapplication.data.models;

import com.symphony.symphonyapplication.data.utils.Inst_Pla;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@IdClass(Inst_Pla.class)
@Table(name = "instrument_is_to_be_played")
public class InstrumentIsToBePlayed {
    @Id
    @Column(name = "Instrument_id")
    private int instrument_id;

    @Id
    @Column(name = "Music_id")
    private int music_id;

}

