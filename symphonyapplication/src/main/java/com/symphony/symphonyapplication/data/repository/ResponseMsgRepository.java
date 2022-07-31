package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.ResponseMsg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseMsgRepository extends JpaRepository<ResponseMsg, Integer> {
}
