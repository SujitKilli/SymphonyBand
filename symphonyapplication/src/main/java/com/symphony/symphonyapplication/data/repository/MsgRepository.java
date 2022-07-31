package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.Message;
import com.symphony.symphonyapplication.data.utils.MsgId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MsgRepository extends JpaRepository<Message, MsgId> {
}
