package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.ConcertMusic;
import com.symphony.symphonyapplication.data.models.ManagerEmployeeMapping;
import com.symphony.symphonyapplication.data.utils.ManagerEmpID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManagerEmployeeMappingRepository extends JpaRepository<ManagerEmployeeMapping, ManagerEmpID> {

    List<ManagerEmployeeMapping> findByManagerid(String managerid);

    ManagerEmployeeMapping findByEmpid(String empid);
}
