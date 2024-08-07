package com.portfolio.repositories;

import com.portfolio.entity.NewsLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsLetterRepository extends JpaRepository<NewsLetter,Long> {
}
