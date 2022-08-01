package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.GuestConcerts;
import com.symphony.symphonyapplication.data.models.InvolvedConcerts;
import com.symphony.symphonyapplication.data.repository.GuestConcertsRepository;
import com.symphony.symphonyapplication.data.repository.InvolvedConcertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/involvedconcerts")
public class InvolvedConcertsController {

    @Autowired
    InvolvedConcertsRepository involvedConcertsRepository;

    @GetMapping("/findByUserandTimeLine/{user}/{timeline}")
    public ResponseEntity<List<InvolvedConcerts>> getUserInvolvedConcerts (@PathVariable("user") String user,@PathVariable("timeline") String timeline) {
        List<InvolvedConcerts> involvedConcerts = involvedConcertsRepository.findByUseridAndTimeline(user,timeline);
        return new ResponseEntity<>(involvedConcerts, HttpStatus.OK);
    }
}
