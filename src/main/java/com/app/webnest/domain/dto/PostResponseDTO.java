package com.app.webnest.domain.dto;

import lombok.*;

import java.util.Date;

@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class PostResponseDTO {
    private Long id;
    private String postContent;
    private String postTitle;
    private Date postCreateAt;
    private Integer postViewCount;
    private Long userId;
    private String postType;
    private String userNickname;
}



