package com.app.webnest.domain.vo;

import lombok.*;

import java.util.Date;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
public class FollowNotificationVO {
    private Long id;
    private boolean followNotificationIsRead;
    private Date followNotificationCreateAt;
    private Long actorUserId; // erd고치기
    private Long receiverUserId;
    private Long followId;
}
