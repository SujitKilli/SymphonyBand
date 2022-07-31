package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.InstrumentIsToBePlayed;
import com.symphony.symphonyapplication.data.utils.Inst_Pla;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentIsToBePlayedRepository  extends JpaRepository<InstrumentIsToBePlayed, Inst_Pla> {
}
