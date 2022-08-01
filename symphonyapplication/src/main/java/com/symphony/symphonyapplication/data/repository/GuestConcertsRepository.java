package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.GuestConcerts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestConcertsRepository extends JpaRepository<GuestConcerts, String> {
}
