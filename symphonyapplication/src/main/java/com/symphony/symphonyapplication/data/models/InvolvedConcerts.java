package com.symphony.symphonyapplication.data.models;


import com.symphony.symphonyapplication.data.utils.InvolvedConcertID;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Data
@Entity
@IdClass(InvolvedConcertID.class)
@Table(name = "involvedconcerts")
public class InvolvedConcerts implements Serializable {

    @Id
    @Column(name = "Concert_id")
    private int concert_id;

    @Column(name = "Concert_date")
    @NotNull
    private Date concert_date;

    @Column(name = "Concert_time")
    @NotNull
    private Time concert_time;

    @Column(name = "Concert_status")
    @NotNull
    private String concert_status;

    @Column(name = "Loc_id")
    @NotNull
    private int loc_id;

    @Column(name = "Amount")
    @NotNull
    private int amount;

    @Column(name = "Manager_id")
    @NotNull
    private String managerid;

    @Column(name = "Cust_id")
    @NotNull
    private String custid;

    @Column(name = "Concert_type")
    @NotNull
    private int concert_type;

    @Column(name = "Rating")
    private Integer rating;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "Location_name")
    private String location_name;

    @Column(name = "Actual_Type")
    private String actual_type;

    @Id
    @Column(name = "user_id")
    private String userid;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "Timeline")
    private String timeline;

    public InvolvedConcerts(){}
}
