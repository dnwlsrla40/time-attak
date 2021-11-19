package com.sparta.timeattackspring.service;

import com.sparta.timeattackspring.domain.Article;
import com.sparta.timeattackspring.dto.ArticleDto;
import com.sparta.timeattackspring.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional
    public void save(ArticleDto articleDto){
        Article article = Article.builder()
                .title(articleDto.getTitle())
                .content(articleDto.getContent())
                .build();
        articleRepository.save(article);
    }

    @Transactional
    public List<Article> getArticles() {
        return articleRepository.findAll();
    }
}
