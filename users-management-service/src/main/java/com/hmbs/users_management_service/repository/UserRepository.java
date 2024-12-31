package com.hmbs.users_management_service.repository;

import com.hmbs.users_management_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
