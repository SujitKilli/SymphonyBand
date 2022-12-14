package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "concert")
public class Concert {
    @Id
    @Column(name = "Concert_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
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



}
