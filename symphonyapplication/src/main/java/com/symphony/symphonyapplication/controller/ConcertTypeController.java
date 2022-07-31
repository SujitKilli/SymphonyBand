package com.symphony.symphonyapplication.controller;


import com.symphony.symphonyapplication.data.models.ConcertType;
import com.symphony.symphonyapplication.data.repository.ConcertTypeRepository;
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
@RequestMapping("/concerttype")

public class ConcertTypeController {

    @Autowired
    ConcertTypeRepository concerttypeRepository;

    @GetMapping("/all")
    public ResponseEntity<List<ConcertType>> getAll () {
        List<ConcertType> concerttypes = concerttypeRepository.findAll();
        return new ResponseEntity<>(concerttypes, HttpStatus.OK);
    }
}
