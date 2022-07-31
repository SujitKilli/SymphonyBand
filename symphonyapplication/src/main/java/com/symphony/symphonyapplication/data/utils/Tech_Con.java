package com.symphony.symphonyapplication.data.utils;

import java.io.Serializable;

public class Tech_Con implements Serializable {
    private String technician_id;

    private int concert_id;

    public Tech_Con(){}

    public Tech_Con(String technician_id,int concert_id) {
        this.technician_id = technician_id;
        this.concert_id = concert_id;
    }
}
