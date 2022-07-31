package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.Notifies;
import com.symphony.symphonyapplication.data.utils.NotifiesID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotifiesRepository extends JpaRepository<Notifies, NotifiesID> {
}
