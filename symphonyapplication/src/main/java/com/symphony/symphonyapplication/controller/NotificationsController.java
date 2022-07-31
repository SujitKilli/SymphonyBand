package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.Notifications;
import com.symphony.symphonyapplication.data.repository.NotificationsRepository;
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
@RequestMapping("/notification")

public class NotificationsController {
    @Autowired
    NotificationsRepository notificationsRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Notifications>> getAll () {
        List<Notifications> notification = notificationsRepository.findAll();
        return new ResponseEntity<>(notification, HttpStatus.OK);
    }
}
