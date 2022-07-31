package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
