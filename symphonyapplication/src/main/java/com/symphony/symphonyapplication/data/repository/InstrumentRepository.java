package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentRepository extends JpaRepository<Instrument, Integer> {
}
