package com.sion.awsservice.web.dto;

import lombok.Getter;
import lombok.Builder;
@Getter
public class PostsUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
