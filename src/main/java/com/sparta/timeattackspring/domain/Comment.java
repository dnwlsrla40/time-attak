package com.sparta.timeattackspring.domain;

import javax.persistence.*;

@Entity
public class Comment extends Timestamped{

    @Id // ID 값, Primary Key로 사용하겠다는 뜻입니다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다.
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name="articleId")
    private Article article;
}
