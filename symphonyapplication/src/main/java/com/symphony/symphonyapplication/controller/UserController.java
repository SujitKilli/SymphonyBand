package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.User;
import com.symphony.symphonyapplication.data.models.UserRoleMapping;
import com.symphony.symphonyapplication.data.repository.UserRepository;
import com.symphony.symphonyapplication.data.repository.UserRoleMappingRepository;
import com.symphony.symphonyapplication.data.repository.UserRoleRepository;
import com.symphony.symphonyapplication.exception.ResourceNotFoundExcpetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll () {
        List<User> users = userRepository.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getSingleUser(@PathVariable("id") String id){
        User curUser = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExcpetion("User id " + id + " not found"));
        return new ResponseEntity<>(curUser,HttpStatus.OK);
    }
}
