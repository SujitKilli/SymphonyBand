package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.UserRoleMapping;
import com.symphony.symphonyapplication.data.repository.UserRoleMappingRepository;
import com.symphony.symphonyapplication.exception.ResourceNotFoundExcpetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/userandrole")
public class UserRoleMappingController {

    @Autowired
    UserRoleMappingRepository userRoleMappingRepository;

    @GetMapping("/all")
    public ResponseEntity<Object> getAllWithRole() {
        List<UserRoleMapping> userRoleMappings = userRoleMappingRepository.findAll();
        return new ResponseEntity<>(userRoleMappings, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<UserRoleMapping> getSingleUser(@PathVariable("id") String id){
        UserRoleMapping curUser = userRoleMappingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExcpetion("User id " + id + " not found"));
        return new ResponseEntity<>(curUser,HttpStatus.OK);
    }

    @GetMapping("/findByPhone/{phone}")
    public ResponseEntity<UserRoleMapping> getSingleUserByPhone(@PathVariable("phone") String phone){
        UserRoleMapping curUser = userRoleMappingRepository.findByphno(phone);
        return new ResponseEntity<>(curUser,HttpStatus.OK);
    }

}
