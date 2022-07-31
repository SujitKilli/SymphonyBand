package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.TechnicianInvolvedInConcert;
import com.symphony.symphonyapplication.data.utils.Tech_Con;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianInvolvedInConcertRepository extends JpaRepository<TechnicianInvolvedInConcert, Tech_Con> {
}
