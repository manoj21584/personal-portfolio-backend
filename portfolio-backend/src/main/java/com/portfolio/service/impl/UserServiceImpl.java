package com.portfolio.service.impl;

import com.portfolio.entity.User;
import com.portfolio.repositories.UserRepository;
import com.portfolio.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "Thankyou for your response!!";
    }
}
