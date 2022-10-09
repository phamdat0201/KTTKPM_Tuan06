package com.example.KTTKPM_Tuan06.service;

import com.example.KTTKPM_Tuan06.authen.UserPrincipal;
import com.example.KTTKPM_Tuan06.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
