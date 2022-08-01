package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.Concert;
import com.symphony.symphonyapplication.data.models.GuestConcerts;
import com.symphony.symphonyapplication.data.repository.GuestConcertsRepository;
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
@RequestMapping("/guestconcerts")
public class GuestConcertsController {

    @Autowired
    GuestConcertsRepository guestConcertsRepository;

    @GetMapping("/findBy")
    public ResponseEntity<List<GuestConcerts>> getAll () {
        List<GuestConcerts> guestConcerts = guestConcertsRepository.findAll();
        return new ResponseEntity<>(guestConcerts, HttpStatus.OK);
    }
}
