package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "User_id")
    private String user_id;

    @Column(name = "Fname")
    @NotNull
    private String fname;

    @Column(name = "Lname")
    @NotNull
    private String lname;

    @Column(name = "Pwd")
    @NotNull
    private String pwd;

    @Column(name = "Ph_No",unique=true)
    @NotNull
    private String phno;

    @Column(name = "Role_id")
    @NotNull
    private int role_id;

    @Column(name = "Security_Question")
    @NotNull
    private String security_question;

    @Column(name = "Security_ans")
    @NotNull
    private String security_ans;

    public User(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user.user_id == user_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id);
    }
}
