package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "chat")
public class Chat {

    @Id
    @Column(name = "Chat_id")
    private int chat_id;
}
