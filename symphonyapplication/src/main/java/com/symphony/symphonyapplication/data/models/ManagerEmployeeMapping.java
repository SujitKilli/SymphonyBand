package com.symphony.symphonyapplication.data.models;

import com.symphony.symphonyapplication.data.utils.ConcertMusicID;
import com.symphony.symphonyapplication.data.utils.ManagerEmpID;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@IdClass(ManagerEmpID.class)
@Table(name = "mngempmapping")
public class ManagerEmployeeMapping {

    @Id
    @Column(name = "Manager_id")
    private String managerid;

    @Id
    @Column(name = "Emp_id")
    private String empid;

    @Column(name = "Manager")
    private String manager;

    @Column(name = "Employee")
    private String employee;

    @Column(name = "Role_id")
    private String roleid;

    @Column(name = "Role_name")
    private String rolename;
}
