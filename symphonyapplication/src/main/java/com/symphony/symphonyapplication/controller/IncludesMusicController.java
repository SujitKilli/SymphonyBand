package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.IncludesMusic;
import com.symphony.symphonyapplication.data.repository.IncludesMusicRepository;
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
@RequestMapping("/includesmusic")

public class IncludesMusicController {
    @Autowired
    IncludesMusicRepository includesmusicRepository;

    @GetMapping("/all")
    public ResponseEntity<List<IncludesMusic>> getAll () {
        List<IncludesMusic> includesMusic = includesmusicRepository.findAll();
        return new ResponseEntity<>(includesMusic, HttpStatus.OK);
    }
}
