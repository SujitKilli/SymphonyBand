package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "userrolemapping")
public class UserRoleMapping implements Serializable {
    @Id
    private String user_id;

    private String fname;

    private String lname;

    private String pwd;

    private String ph_no;

    private int role_id;

    private String security_question;

    private String security_ans;

    private String role_name;

    public UserRoleMapping(){}
}
