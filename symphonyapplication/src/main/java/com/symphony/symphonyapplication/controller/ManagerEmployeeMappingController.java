package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.ManagerEmployeeMapping;
import com.symphony.symphonyapplication.data.repository.ManagerEmployeeMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/managerempmapping")
public class ManagerEmployeeMappingController {

    @Autowired
    ManagerEmployeeMappingRepository managerEmployeeMappingRepository;

    @GetMapping("/all")
    public ResponseEntity<List<ManagerEmployeeMapping>> getAll () {
        List<ManagerEmployeeMapping> managerEmpMaps = managerEmployeeMappingRepository.findAll();
        return new ResponseEntity<>(managerEmpMaps, HttpStatus.OK);
    }

    @GetMapping("/findByManager/{managerid}")
    public ResponseEntity<List<ManagerEmployeeMapping>> getForManager (@PathVariable("managerid") String managerid) {
        List<ManagerEmployeeMapping> managerEmps = managerEmployeeMappingRepository.findByManagerid(managerid);
        return new ResponseEntity<>(managerEmps, HttpStatus.OK);
    }

    @GetMapping("/findByEmp/{empid}")
    public ResponseEntity<ManagerEmployeeMapping> getForEmp (@PathVariable("empid") String empid) {
        ManagerEmployeeMapping managerEmps = managerEmployeeMappingRepository.findByEmpid(empid);
        return new ResponseEntity<>(managerEmps, HttpStatus.OK);
    }


}
