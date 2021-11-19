package com.sparta.timeattackspring.controller;

import com.sparta.timeattackspring.domain.Article;
import com.sparta.timeattackspring.dto.ArticleDto;
import com.sparta.timeattackspring.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping("/article")
    public String saveArticle(@RequestBody ArticleDto articleDto) {
        articleService.save(articleDto);
        String msg = "포스팅 업데이트 성공";
        return msg;
    }

    @GetMapping("/articles")
    public List<Article> getArticles(){
        return articleService.getArticles();
    }
}
