package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
