package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.Technician;
import com.symphony.symphonyapplication.data.models.TechnicianInvolvedInConcert;
import com.symphony.symphonyapplication.data.repository.TechnicianInvolvedInConcertRepository;
import com.symphony.symphonyapplication.data.repository.TechnicianRepository;
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
@RequestMapping("/technician")
public class TechnicianController {
    @Autowired
    TechnicianRepository technicianRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Technician>> getAll() {
        List<Technician> technicians = technicianRepository.findAll();
        return new ResponseEntity<>(technicians, HttpStatus.OK);
    }
}
