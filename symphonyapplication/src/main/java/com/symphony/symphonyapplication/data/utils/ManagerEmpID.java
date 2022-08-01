package com.symphony.symphonyapplication.data.utils;

import java.io.Serializable;

public class ManagerEmpID implements Serializable {

    private String managerid;
    private String empid;

    public ManagerEmpID(){}

    public ManagerEmpID(String managerid, String empid) {
        this.managerid = managerid;
        this.empid = empid;
    }


}
