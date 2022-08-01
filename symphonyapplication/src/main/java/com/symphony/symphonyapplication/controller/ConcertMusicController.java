package com.symphony.symphonyapplication.controller;

import com.symphony.symphonyapplication.data.models.Concert;
import com.symphony.symphonyapplication.data.models.ConcertMusic;
import com.symphony.symphonyapplication.data.repository.ConcertMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/concertmusicmapping")
public class ConcertMusicController {

    @Autowired
    ConcertMusicRepository concertMusicRepository;

    @GetMapping("/all")
    public ResponseEntity<List<ConcertMusic>> getAll () {
        List<ConcertMusic> concertMusics = concertMusicRepository.findAll();
        return new ResponseEntity<>(concertMusics, HttpStatus.OK);
    }

    @GetMapping("/findByTypeId/{type_id}")
    public ResponseEntity<List<ConcertMusic>> getByConcertTypeID (@PathVariable("type_id") String type_id) {
        List<ConcertMusic> concertMusics = concertMusicRepository.findByTypeid(Integer.parseInt(type_id));
        return new ResponseEntity<>(concertMusics, HttpStatus.OK);
    }

    @GetMapping("/findByConcertType/{concert_type}")
    public ResponseEntity<List<ConcertMusic>> getByConcertType (@PathVariable("concert_type") String concert_type) {
        List<ConcertMusic> concertMusics = concertMusicRepository.findByConcerttype(concert_type);
        return new ResponseEntity<>(concertMusics, HttpStatus.OK);
    }
}
