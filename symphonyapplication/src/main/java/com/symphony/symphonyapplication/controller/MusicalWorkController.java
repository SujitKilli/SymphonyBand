package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.MusicalWork;
import com.symphony.symphonyapplication.data.repository.MusicalWorkRepository;
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
@RequestMapping("/musicalwork")

public class MusicalWorkController {
    @Autowired
    MusicalWorkRepository musicalWorkRepository;

    @GetMapping("/all")
    public ResponseEntity<List<MusicalWork>> getAll () {
        List<MusicalWork> musicalworks = musicalWorkRepository.findAll();
        return new ResponseEntity<>(musicalworks, HttpStatus.OK);
    }
}
