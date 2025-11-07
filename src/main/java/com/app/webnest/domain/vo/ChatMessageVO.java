package com.app.webnest.domain.vo;

import lombok.*;

import java.util.Date;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
public class ChatMessageVO {
    private Long id;
    private Long chatRoomId;
    private Long userId;
    private String chatMessageContent;
    private Date chatMessageCreateAt;
}
