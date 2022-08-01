package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.Concert;
import com.symphony.symphonyapplication.data.models.UserLogin;
import com.symphony.symphonyapplication.data.models.UserRoleMapping;
import com.symphony.symphonyapplication.data.repository.ConcertRepository;
import com.symphony.symphonyapplication.data.repository.UserRepository;
import com.symphony.symphonyapplication.exception.ResourceNotFoundExcpetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/concert")
public class ConcertController {

    private ConcertRepository concertRepository;

    ConcertController(ConcertRepository concertRepository){
        this.concertRepository = concertRepository;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Concert>> getAll () {
        List<Concert> concerts = concertRepository.findAll();
        return new ResponseEntity<>(concerts, HttpStatus.OK);
    }

    @PostMapping("/createConcert")
    public ResponseEntity<Concert> createConcert(@RequestBody Concert concert) {

        if (concert != null) {
            concert.setConcert_status("Requested");
            concertRepository.save(concert);
            return new ResponseEntity<>(concert, HttpStatus.OK);
        }

        throw new ResourceNotFoundExcpetion("No employee found with passed username/password");

    }

    @PostMapping("/approveConcert")
    public ResponseEntity<Concert> approveConcert(@RequestBody ApproveConcertModel approveConcertModel) {

        Concert curConcert = concertRepository.findById(Integer.parseInt(approveConcertModel.concertID)).orElseThrow(() -> new ResourceNotFoundExcpetion("Concert not found"));
        if (curConcert != null) {
            curConcert.setConcert_status("InProgress");
            curConcert.setManagerid(approveConcertModel.managerID);
            concertRepository.save(curConcert);
            return new ResponseEntity<>(curConcert, HttpStatus.OK);
        }

        throw new ResourceNotFoundExcpetion("No employee found with passed username/password");

    }
}

class ApproveConcertModel{
    String concertID;

    String managerID;

    ApproveConcertModel(String concertID,String managerID){
        this.concertID = concertID;
        this.managerID = managerID;
    }
}
