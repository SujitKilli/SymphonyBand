package com.symphony.symphonyapplication.data.utils;

import java.io.Serializable;

public class IncludesMusicid implements Serializable {
    private int type_id;

    private int music_id;

    public IncludesMusicid(){}

    public IncludesMusicid(int type_id,int music_id) {
        this.type_id = type_id;
        this.music_id = music_id;
    }

}