package com.symphony.symphonyapplication.data.utils;

import java.io.Serializable;
import java.sql.Timestamp;

public class MsgId implements Serializable {
    private int chat_id;

    private Timestamp time_stamp;

    public MsgId(){}

    public MsgId(int chat_id,Timestamp time_stamp) {
        this.chat_id = chat_id;
        this.time_stamp = time_stamp;
    }
}