package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRespository extends JpaRepository<UserLogin, Integer> {
}
