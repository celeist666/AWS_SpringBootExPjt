package com.springboot.aws.test.web.dto;

import com.springboot.aws.test.web.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    // 굳이 모든 필드를 가진 생성자를 쓸 필요 없어서 Entity를 받아서 처리한다.
    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }


}
