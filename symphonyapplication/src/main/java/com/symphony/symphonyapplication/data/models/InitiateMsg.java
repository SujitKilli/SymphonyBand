package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "initiate_msg")
public class InitiateMsg {

    @Column(name = "User_id")
    @NotNull
    private int user_id;

    @Id
    @Column(name = "Chat_id")
    private int chat_id;

}
