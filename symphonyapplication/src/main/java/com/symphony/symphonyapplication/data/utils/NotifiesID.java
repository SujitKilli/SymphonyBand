package com.symphony.symphonyapplication.data.utils;

import java.io.Serializable;

public class NotifiesID implements Serializable {
    private String user_id;

    private int notif_id;

    public NotifiesID(){}

    public NotifiesID(String user_id,int notif_id) {
        this.user_id = user_id;
        this.notif_id = notif_id;
    }

}