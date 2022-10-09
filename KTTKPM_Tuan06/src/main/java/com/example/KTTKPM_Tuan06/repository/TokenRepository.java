package com.example.KTTKPM_Tuan06.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.KTTKPM_Tuan06.entity.Token;

public interface TokenRepository
        extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
