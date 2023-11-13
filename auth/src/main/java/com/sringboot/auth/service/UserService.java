package com.sringboot.auth.service;

import com.sringboot.auth.model.User;
import com.sringboot.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User registerNewUser(User user){
        return userRepository.save(user);
    }
}
