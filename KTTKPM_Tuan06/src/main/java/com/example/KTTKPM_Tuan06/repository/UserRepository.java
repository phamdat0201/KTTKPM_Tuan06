package com.example.KTTKPM_Tuan06.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.KTTKPM_Tuan06.entity.User;

public interface UserRepository
        extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
