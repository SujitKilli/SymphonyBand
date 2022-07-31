package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.Concert;
import com.symphony.symphonyapplication.data.models.UserRole;
import com.symphony.symphonyapplication.data.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/userRoles")
public class UserRoleController {

    @Autowired
    UserRoleRepository userRoleRepository;

    @GetMapping("/all")
    public ResponseEntity<List<UserRole>> getAll () {
        List<UserRole> userRoles = userRoleRepository.findAll();
        return new ResponseEntity<>(userRoles, HttpStatus.OK);
    }
}
