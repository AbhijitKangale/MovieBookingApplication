package com.sapient.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.userservice.model.User;

public interface UserServiceRepository extends JpaRepository<User, Long> {

}
