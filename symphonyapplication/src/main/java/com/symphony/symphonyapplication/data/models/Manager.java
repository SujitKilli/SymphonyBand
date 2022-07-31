package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "manager")
public class Manager {

    @Id
    @Column(name = "User_id")
    private String user_id;
}
