package com.symphony.symphonyapplication.controller;


import com.symphony.symphonyapplication.data.models.ElaboratedConcerts;
import com.symphony.symphonyapplication.data.repository.ElaboratedConcertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/elaboratedconcerts")
public class ElaboratedConcertsController {

    @Autowired
    ElaboratedConcertsRepository elaboratedConcertsRepository;

    @GetMapping("/findByCustomerAndTimeline/{customer}/{timeline}")
    public ResponseEntity<List<ElaboratedConcerts>> getCustomerConcerts (@PathVariable("customer") String customer, @PathVariable("timeline") String timeline) {
        List<ElaboratedConcerts> customerConcerts = elaboratedConcertsRepository.findByCustidAndTimeline(customer,timeline);
        return new ResponseEntity<>(customerConcerts, HttpStatus.OK);
    }

    @GetMapping("/findByManagerAndTimeline/{manager}/{timeline}")
    public ResponseEntity<List<ElaboratedConcerts>> getManagerConcerts (@PathVariable("manager") String manager, @PathVariable("timeline") String timeline) {
        List<ElaboratedConcerts> managerConcerts = elaboratedConcertsRepository.findByManageridAndTimeline(manager,timeline);
        return new ResponseEntity<>(managerConcerts, HttpStatus.OK);
    }
}
