package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.InvolvedConcerts;
import com.symphony.symphonyapplication.data.utils.InvolvedConcertID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvolvedConcertsRepository extends JpaRepository<InvolvedConcerts, InvolvedConcertID> {

    List<InvolvedConcerts> findByUseridAndTimeline(String userid,String timeline);
}
