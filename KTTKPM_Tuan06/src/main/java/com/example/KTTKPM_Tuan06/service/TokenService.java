package com.example.KTTKPM_Tuan06.service;

import com.example.KTTKPM_Tuan06.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
