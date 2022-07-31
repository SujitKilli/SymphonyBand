package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.InitiateMsg;
import com.symphony.symphonyapplication.data.repository.InitiateMessageRepository;
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
@RequestMapping("/initiatemsg")

public class InitiateMessageController {
    @Autowired
    InitiateMessageRepository initiatemsgRepository;

    @GetMapping("/all")
    public ResponseEntity<List<InitiateMsg>> getAll () {
        List<InitiateMsg> InitiateMsgs = initiatemsgRepository.findAll();
        return new ResponseEntity<>(InitiateMsgs, HttpStatus.OK);
    }
}
