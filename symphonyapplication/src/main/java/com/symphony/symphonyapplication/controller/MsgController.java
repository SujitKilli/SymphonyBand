package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.Message;
import com.symphony.symphonyapplication.data.repository.MsgRepository;
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
@RequestMapping("/msg")

public class MsgController {
    @Autowired
    MsgRepository msgRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Message>> getAll () {
        List<Message> msgs = msgRepository.findAll();
        return new ResponseEntity<>(msgs, HttpStatus.OK);
    }
}
