package com.portfolio.service.impl;

import com.portfolio.entity.NewsLetter;
import com.portfolio.repositories.NewsLetterRepository;
import com.portfolio.service.NewsLetterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewsLetterServiceImpl implements NewsLetterService {
    private NewsLetterRepository newsLetterRepository;
    @Override
    public String createNewsLetter(NewsLetter newsLetter) {
        newsLetterRepository.save(newsLetter);
        return "Thanks for Subscribing "  ;
    }
}
