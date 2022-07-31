package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<Concert, Integer> {
}
