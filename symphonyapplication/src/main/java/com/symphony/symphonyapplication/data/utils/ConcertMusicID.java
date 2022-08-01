package com.symphony.symphonyapplication.data.utils;

import java.io.Serializable;

public class ConcertMusicID implements Serializable {

    private int typeid;
    private int musicid;

    public ConcertMusicID(){}

    public ConcertMusicID(int typeid, int musicid) {
        this.typeid = typeid;
        this.musicid = musicid;
    }

}
