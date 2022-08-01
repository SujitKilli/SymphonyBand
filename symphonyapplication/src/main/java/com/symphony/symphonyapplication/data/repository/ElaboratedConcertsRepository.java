package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.ElaboratedConcerts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ElaboratedConcertsRepository extends JpaRepository<ElaboratedConcerts, Integer> {

    List<ElaboratedConcerts> findByCustidAndTimeline(String custId, String timeline);

    List<ElaboratedConcerts> findByManageridAndTimeline(String managerId, String timeline);
}
