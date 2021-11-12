package com.sparta.timeattackspring.repository;

import com.sparta.timeattackspring.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
