package com.symphony.symphonyapplication.data.utils;

import java.io.Serializable;

public class Inst_Pla implements Serializable {
    private int instrument_id;
    private int music_id;

    public Inst_Pla(){}

    public Inst_Pla(int instrument_id, int music_id) {
        this.instrument_id = instrument_id;
        this.music_id = music_id;
    }
}
