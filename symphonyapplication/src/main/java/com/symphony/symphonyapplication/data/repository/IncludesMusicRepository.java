package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.IncludesMusic;
import com.symphony.symphonyapplication.data.utils.IncludesMusicid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncludesMusicRepository  extends JpaRepository<IncludesMusic, IncludesMusicid> {
}
