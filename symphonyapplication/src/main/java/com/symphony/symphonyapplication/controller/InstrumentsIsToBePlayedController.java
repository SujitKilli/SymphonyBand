package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.InstrumentIsToBePlayed;
import com.symphony.symphonyapplication.data.repository.InstrumentIsToBePlayedRepository;
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
@RequestMapping("/instrumentsistobeplayed")

public class InstrumentsIsToBePlayedController {
    @Autowired
    InstrumentIsToBePlayedRepository instrumentsistoBeplayedRepository;

    @GetMapping("/all")
    public ResponseEntity<List<InstrumentIsToBePlayed>> getAll () {
        List<InstrumentIsToBePlayed> InstrumentIsToBePlayeds = instrumentsistoBeplayedRepository.findAll();
        return new ResponseEntity<>(InstrumentIsToBePlayeds, HttpStatus.OK);
    }
}
