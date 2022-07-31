package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.MusicianPlaysInConcert;
import com.symphony.symphonyapplication.data.repository.MusicianPlaysInConcertRepository;
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
@RequestMapping("/musicianPlaysInConcert")

public class MusicianPlaysInConcertController {
    @Autowired
    MusicianPlaysInConcertRepository musicianPlaysInConcertRepository;

    @GetMapping("/all")
    public ResponseEntity<List<MusicianPlaysInConcert>> getAll () {
        List<MusicianPlaysInConcert> musicianPlaysInConcerts = musicianPlaysInConcertRepository.findAll();
        return new ResponseEntity<>(musicianPlaysInConcerts, HttpStatus.OK);
    }
}
