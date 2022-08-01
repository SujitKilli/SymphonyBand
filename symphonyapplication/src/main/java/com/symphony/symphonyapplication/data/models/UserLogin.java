package com.symphony.symphonyapplication.data.models;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "user_login")
public class UserLogin {

    @Column(name = "User_id")
    private String user_id;

    @Id
    @Column(name = "Login_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer login_id;

    @Column(name = "Login_time")
    @NotNull
    private Timestamp login_time;

    @Column(name = "Logout_time")
    private Timestamp logout_time;
}
