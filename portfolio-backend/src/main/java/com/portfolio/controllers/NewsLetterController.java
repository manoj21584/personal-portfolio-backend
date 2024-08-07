package com.portfolio.controllers;

import com.portfolio.entity.NewsLetter;
import com.portfolio.service.NewsLetterService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor
public class NewsLetterController {
    private NewsLetterService newsLetterService;
    @PostMapping("/newsLetter")
    public ResponseEntity<Map<String, Object>> createNewsLetter(@RequestBody NewsLetter newsLetter){
        String response=newsLetterService.createNewsLetter(newsLetter);
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("code", HttpStatus.CREATED.value());
        responseBody.put("message", response);

        return new ResponseEntity<>(responseBody, HttpStatus.CREATED);    }
}
