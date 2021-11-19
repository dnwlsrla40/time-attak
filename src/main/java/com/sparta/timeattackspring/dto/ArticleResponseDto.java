package com.sparta.timeattackspring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArticleResponseDto {
    private Long id;
    private String title;
    private String content;

    @JsonProperty("comment_num")
    private int commentNum;
}
