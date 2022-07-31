package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "sysAdmin")
public class SysAdmin {

    @Id
    @Column(name = "User_id")
    private String user_id;
}
