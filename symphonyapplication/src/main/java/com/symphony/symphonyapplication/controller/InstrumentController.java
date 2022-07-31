package com.symphony.symphonyapplication.controller;
import com.symphony.symphonyapplication.data.models.Instrument;
import com.symphony.symphonyapplication.data.repository.InstrumentRepository;
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
@RequestMapping("/instrument")
public class InstrumentController {
    @Autowired
    InstrumentRepository instrumentRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Instrument>> getAll () {
        List<Instrument> instruments = instrumentRepository.findAll();
        return new ResponseEntity<>(instruments, HttpStatus.OK);
    }
}
