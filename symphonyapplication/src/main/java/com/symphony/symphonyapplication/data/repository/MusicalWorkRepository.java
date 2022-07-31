package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.MusicalWork;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicalWorkRepository extends JpaRepository<MusicalWork, Integer> {
}
