package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.ConcertType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertTypeRepository extends JpaRepository<ConcertType, Integer> {
}
