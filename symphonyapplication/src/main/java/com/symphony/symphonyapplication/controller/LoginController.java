package com.symphony.symphonyapplication.controller;


import com.symphony.symphonyapplication.data.models.User;
import com.symphony.symphonyapplication.data.models.UserLogin;
import com.symphony.symphonyapplication.data.models.UserRoleMapping;
import com.symphony.symphonyapplication.data.repository.UserLoginRespository;
import com.symphony.symphonyapplication.data.repository.UserRepository;
import com.symphony.symphonyapplication.data.repository.UserRoleMappingRepository;
import com.symphony.symphonyapplication.exception.ResourceNotFoundExcpetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.UUID;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class LoginController {

    private UserRoleMappingRepository userRoleMappingRepository;
    private UserLoginRespository userLoginRespository;
    private UserRepository userRepository;

    LoginController(UserRoleMappingRepository userRoleMappingRepository,UserLoginRespository userLoginRespository,UserRepository userRepository){
        this.userLoginRespository = userLoginRespository;
        this.userRoleMappingRepository = userRoleMappingRepository;
        this.userRepository = userRepository;

    }

    @PostMapping("/login")
    public ResponseEntity<UserRoleMapping> createLogin(@RequestBody LoginDetailsModel user) {

        UserRoleMapping curUser = userRoleMappingRepository.findByphno(user.phoneNo);

        if (curUser != null && curUser.getPwd().equals(user.pwd)) {
            UserLogin curLogin = new UserLogin();
            curLogin.setLogin_time(new Timestamp(System.currentTimeMillis()));
            curLogin.setUser_id(curUser.getUser_id());
            userLoginRespository.save(curLogin);
            return new ResponseEntity<>(curUser, HttpStatus.OK);
        }

        throw new ResourceNotFoundExcpetion("No employee found with passed username/password");

    }

    @PostMapping("/register")
    public ResponseEntity<User> createLogin(@RequestBody User user) {

        if (user != null) {
            user.setUser_id(UUID.randomUUID().toString());
            user.setRole_id(5);
            userRepository.save(user);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }

        throw new ResourceNotFoundExcpetion("No employee found with passed username/password");

    }


}

class LoginDetailsModel {
    String phoneNo;
    String pwd;

    LoginDetailsModel(String phoneNo,String pwd){
        this.phoneNo = phoneNo;
        this.pwd = pwd;
    }
}
