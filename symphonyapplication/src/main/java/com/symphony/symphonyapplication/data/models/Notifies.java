package com.symphony.symphonyapplication.data.models;
import com.symphony.symphonyapplication.data.utils.NotifiesID;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@IdClass(NotifiesID.class)
@Table(name = "notifies")
public class Notifies {
    @Id
    @Column(name = "User_id")
    private String user_id;

    @Id
    @Column(name = "Notif_id")
    private int notif_id;
}