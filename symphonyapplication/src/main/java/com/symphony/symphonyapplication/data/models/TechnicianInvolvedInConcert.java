package com.symphony.symphonyapplication.data.models;

import com.symphony.symphonyapplication.data.utils.Tech_Con;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@IdClass(Tech_Con.class)
@Table(name = "technician_invloved_in_concert")
public class TechnicianInvolvedInConcert {
    @Id
    @Column(name = "Technician_id")
    private String technician_id;

    @Id
    @Column(name = "Concert_id")
    private int concert_id;

}


