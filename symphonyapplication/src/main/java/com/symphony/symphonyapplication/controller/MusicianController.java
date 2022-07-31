package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.Musician;
import com.symphony.symphonyapplication.data.repository.MusicianRepository;
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
@RequestMapping("/musician")

public class MusicianController {
    @Autowired
    MusicianRepository musicianRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Musician>> getAll () {
        List<Musician> musician = musicianRepository.findAll();
        return new ResponseEntity<>(musician, HttpStatus.OK);
    }
}
