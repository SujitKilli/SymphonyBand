package com.symphony.symphonyapplication.data.utils;

import java.io.Serializable;

public class InvolvedConcertID implements Serializable{

    private String userid;
    private int concert_id;

    public InvolvedConcertID(){}

    public InvolvedConcertID(String userid, int concert_id) {
        this.userid = userid;
        this.concert_id = concert_id;
    }

}
