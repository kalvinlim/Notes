package com.activemeasure.service;

import com.activemeasure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String email, String password){
        return userRepository.authenticate(email, password) != null;
    }
}
