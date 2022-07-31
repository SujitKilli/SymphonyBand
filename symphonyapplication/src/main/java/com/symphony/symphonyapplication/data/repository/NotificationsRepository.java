package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationsRepository extends JpaRepository<Notifications, Integer> {
}
