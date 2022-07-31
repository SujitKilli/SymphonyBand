package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.Musician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicianRepository extends JpaRepository<Musician, String> {
}
