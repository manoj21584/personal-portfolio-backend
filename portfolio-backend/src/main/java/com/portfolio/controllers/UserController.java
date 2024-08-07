package com.portfolio.controllers;

import com.portfolio.entity.User;
import com.portfolio.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping("/saveToDb")
    public ResponseEntity<Map<String, Object>> createUserToDb(@RequestBody User user) {
        String response = userService.createUser(user);

        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("code", HttpStatus.CREATED.value());
        responseBody.put("message", response);

        return new ResponseEntity<>(responseBody, HttpStatus.CREATED);
    }
}
