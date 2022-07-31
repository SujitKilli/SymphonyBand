package com.symphony.symphonyapplication.data.utils;

import java.io.Serializable;

public class Musc_Con implements Serializable {
    private String musician_id;

    private int concert_id;

    public Musc_Con(){}

    public Musc_Con(String musician_id,int concert_id) {
        this.musician_id = musician_id;
        this.concert_id = concert_id;
    }
}