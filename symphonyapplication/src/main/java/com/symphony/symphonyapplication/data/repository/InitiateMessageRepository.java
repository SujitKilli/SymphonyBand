package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.InitiateMsg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InitiateMessageRepository extends JpaRepository<InitiateMsg, Integer> {
}
