package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.Concert;
import com.symphony.symphonyapplication.data.repository.ConcertRepository;
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
@RequestMapping("/concert")
public class ConcertController {
    @Autowired
    ConcertRepository concertRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Concert>> getAll () {
        List<Concert> concerts = concertRepository.findAll();
        return new ResponseEntity<>(concerts, HttpStatus.OK);
    }
}
