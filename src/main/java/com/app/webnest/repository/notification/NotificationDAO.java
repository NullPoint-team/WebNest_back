package com.app.webnest.repository.notification;

import com.app.webnest.domain.dto.notification.CommentNotificationDTO;
import com.app.webnest.domain.dto.notification.FollowNotificationDTO;
import com.app.webnest.domain.dto.notification.PostNotificationDTO;
import com.app.webnest.mapper.UserMapper;
import com.app.webnest.repository.user.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class NotificationDAO {
    private final UserMapper userMapper;

    public List<PostNotificationDTO> getPostNotificationByUserId(Long userId) {
        return userMapper.selectPostNotificationByUserId(userId);
    }

    public List<CommentNotificationDTO> getCommentNotificationByUserId(Long userId) {
        return userMapper.selectCommentNotificationByUserId(userId);
    }
    public List<FollowNotificationDTO> getFollowNotificationByUserId(Long userId) {
        return userMapper.selectFollowNotificationByUserId(userId);
    }
}
