package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.Instrument;
import com.symphony.symphonyapplication.data.models.Location;
import com.symphony.symphonyapplication.data.repository.InstrumentRepository;
import com.symphony.symphonyapplication.data.repository.LocationRepository;
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
@RequestMapping("/location")
public class LocationController {
    @Autowired
    LocationRepository locationRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Location>> getAll () {
        List<Location> locations = locationRepository.findAll();
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }
}