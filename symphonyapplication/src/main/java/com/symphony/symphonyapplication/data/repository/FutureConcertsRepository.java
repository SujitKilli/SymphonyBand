package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.FutureConcerts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FutureConcertsRepository extends JpaRepository<FutureConcerts, String> {
}
