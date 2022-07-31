package com.symphony.symphonyapplication.data.models;

import com.symphony.symphonyapplication.data.utils.MsgId;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;


@Data
@Entity
@IdClass(MsgId.class)
@Table(name = "message")
public class Message {
    @Id
    @Column(name = "Chat_id")
    private int chat_id;

    @Id
    @Column(name = "Time_stamp")
    @NotNull
    private Timestamp time_stamp;

    @Column(name = "Chat_text")
    @NotNull
    private String chat_text;

    @Column(name = "Sender_id")
    @NotNull
    private String sender_id;

}


