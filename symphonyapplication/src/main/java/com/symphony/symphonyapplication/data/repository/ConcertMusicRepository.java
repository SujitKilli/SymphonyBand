package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.ConcertMusic;
import com.symphony.symphonyapplication.data.utils.ConcertMusicID;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConcertMusicRepository extends JpaRepository<ConcertMusic, ConcertMusicID> {

    List<ConcertMusic> findByTypeid(int typeid);

    List<ConcertMusic> findByConcerttype(String concertType);
}
