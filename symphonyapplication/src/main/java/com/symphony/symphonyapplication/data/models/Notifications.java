package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "notifications")
public class Notifications {

    @Id
    @Column(name = "Notif_id")
    private int notif_id;

    @Column(name = "Initial_timestamp")
    @NotNull
    private Timestamp initial_timestamp;

    @Column(name = "Expiry_timestamp")
    @NotNull
    private Timestamp expiry_timestamp;

    @Column(name = "notif_text")
    @NotNull
    private String notif_text;

}
