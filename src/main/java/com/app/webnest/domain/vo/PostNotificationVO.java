package com.app.webnest.domain.vo;

import lombok.*;

import java.util.Date;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
public class PostNotificationVO {
    private Long id;
    private Long actorUserId;
    private Long receiverUserId;
    private Long postId;
    private Date postNotificationCreateAt;
    private boolean postNotificationIsRead;
    private String postNotificationAction; // erd수정
}
