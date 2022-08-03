package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.FutureConcerts;
import com.symphony.symphonyapplication.data.models.GuestConcerts;
import com.symphony.symphonyapplication.data.repository.FutureConcertsRepository;
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
@RequestMapping("/elaboratedconcerts")
public class FutureRequestsContoller {
    @Autowired
    FutureConcertsRepository futureConcertsRepository;

    @GetMapping("/futureRequests")
    public ResponseEntity<List<FutureConcerts>> getAll () {
        List<FutureConcerts> futureConcerts = futureConcertsRepository.findAll();
        return new ResponseEntity<>(futureConcerts, HttpStatus.OK);
    }
}

