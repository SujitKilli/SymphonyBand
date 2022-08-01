package com.symphony.symphonyapplication.data.repository;

import com.symphony.symphonyapplication.data.models.UserRoleMapping;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRoleMappingRepository extends JpaRepository<UserRoleMapping, String> {
    UserRoleMapping findByphno(String ph_no);
}
