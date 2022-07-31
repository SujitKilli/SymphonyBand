package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.User;
import com.symphony.symphonyapplication.data.models.UserLogin;
import com.symphony.symphonyapplication.data.repository.UserLoginRespository;
import com.symphony.symphonyapplication.data.repository.UserRepository;
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
@RequestMapping("/userlogin")
public class UserLoginController {

    @Autowired
    UserLoginRespository userLoginRespository;

    @GetMapping("/all")
    public ResponseEntity<List<UserLogin>> getAll () {
        List<UserLogin> userLogins = userLoginRespository.findAll();
        return new ResponseEntity<>(userLogins, HttpStatus.OK);
    }

}
