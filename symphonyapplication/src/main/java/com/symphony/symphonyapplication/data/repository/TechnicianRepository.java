package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician, String> {
}
