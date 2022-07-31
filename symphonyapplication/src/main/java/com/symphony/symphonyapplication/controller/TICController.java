package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.TechnicianInvolvedInConcert;
import com.symphony.symphonyapplication.data.repository.TechnicianInvolvedInConcertRepository;
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
@RequestMapping("/technicianInvolvedInConcert")
public class TICController {
    @Autowired
    TechnicianInvolvedInConcertRepository technicianInvolvedInConcertRepository;

    @GetMapping("/all")
    public ResponseEntity<List<TechnicianInvolvedInConcert>> getAll() {
        List<TechnicianInvolvedInConcert> technicianInvolvedInConcerts = technicianInvolvedInConcertRepository.findAll();
        return new ResponseEntity<>(technicianInvolvedInConcerts, HttpStatus.OK);
    }
}
