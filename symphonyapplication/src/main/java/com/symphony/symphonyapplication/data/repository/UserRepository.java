package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.User;
import com.symphony.symphonyapplication.data.models.UserRoleMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByphno(String ph_no);
}