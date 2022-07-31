package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "User_id")
    private String user_id;
}