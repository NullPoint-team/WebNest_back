package com.app.webnest.mapper;

import com.app.webnest.domain.dto.notification.CommentNotificationDTO;
import com.app.webnest.domain.dto.notification.FollowNotificationDTO;
import com.app.webnest.domain.dto.notification.PostNotificationDTO;
import com.app.webnest.domain.dto.search.PostSearchDTO;
import com.app.webnest.domain.vo.PostVO;
import com.app.webnest.domain.vo.QuizVO;
import com.app.webnest.domain.vo.UserInsertSocialVO;
import com.app.webnest.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {


  // 회원 조회
  public Optional<UserVO> select(Long id);

  // 회원의 이메일로 아이디 조회
  public Long selectIdByUserEmail(String userEmail);

  // 회원 전체 조회
  public List<UserVO> selectAll();

  // 이메일 중복 확인
  public boolean existsByUserEmail(String userEmail);

  // 회원 가입
  public void insert(UserVO userVO);

  // 회원 가입 (소셜)
  public void insertSocial(UserInsertSocialVO userInsertSocialVO);

  // 회원 정보 수정
  public void update(UserVO userVO);

  // 회원 탈퇴
  public void delete(Long id);

//  승찬 기생중-------------------
  public List<UserVO> selectByQuery(String query);

  public List<PostSearchDTO> selectQuestionPostQByQuery(String query);

  public List<PostSearchDTO> selectOpenPostQByQuery(String query);

  public List<QuizVO> selectQuizByQuery(String query);

//                  알람
//    post에 대한 알림
    public List<PostNotificationDTO> selectPostNotificationByUserId(Long receiverUserId);
//    comment 알림 test 1L / 3L
    public List<CommentNotificationDTO> selectCommentNotificationByUserId(Long receiverUserId);
//    newFollow 알림 test 1L
    public List<FollowNotificationDTO> selectFollowNotificationByUserId(Long receiverUserId);
}
