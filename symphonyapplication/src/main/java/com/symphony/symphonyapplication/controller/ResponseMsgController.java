package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.ResponseMsg;
import com.symphony.symphonyapplication.data.repository.ResponseMsgRepository;
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
@RequestMapping("/response")
public class ResponseMsgController {
    @Autowired
    ResponseMsgRepository responseMsgRepository;

    @GetMapping("/all")
    public ResponseEntity<List<ResponseMsg>> getAll () {
        List<ResponseMsg> responses = responseMsgRepository.findAll();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }
}
