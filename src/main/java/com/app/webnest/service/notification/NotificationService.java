package com.app.webnest.service.notification;

import com.app.webnest.domain.dto.notification.CommentNotificationDTO;
import com.app.webnest.domain.dto.notification.FollowNotificationDTO;
import com.app.webnest.domain.dto.notification.PostNotificationDTO;

import java.util.List;

public interface NotificationService {
    public List<PostNotificationDTO> getPostNotificationByUserId(Long userId);
    public List<CommentNotificationDTO> getCommentNotificationByUserId(Long userId);
    public List<FollowNotificationDTO> getFollowNotificationByUserId(Long userId);
}
