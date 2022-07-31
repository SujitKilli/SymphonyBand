package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.MusicianPlaysInConcert;
import com.symphony.symphonyapplication.data.utils.Musc_Con;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicianPlaysInConcertRepository extends JpaRepository<MusicianPlaysInConcert, Musc_Con> {
}
