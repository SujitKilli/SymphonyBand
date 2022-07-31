package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.Notifies;
import com.symphony.symphonyapplication.data.repository.NotifiesRepository;
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
@RequestMapping("/notifies")
public class NotifiesController {
    @Autowired
    NotifiesRepository notifiesRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Notifies>> getAll () {
        List<Notifies> notifies = notifiesRepository.findAll();
        return new ResponseEntity<>(notifies, HttpStatus.OK);
    }
}
