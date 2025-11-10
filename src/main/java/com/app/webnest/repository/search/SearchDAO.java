package com.app.webnest.repository.search;

import com.app.webnest.domain.dto.search.PostSearchDTO;
import com.app.webnest.domain.vo.QuizVO;
import com.app.webnest.domain.vo.UserVO;
import com.app.webnest.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SearchDAO {
    private final UserMapper userMapper;

    public List<UserVO> findSearchUsers(String query) {
        return userMapper.selectByQuery(query);
    }
    public List<PostSearchDTO> findSearchOpenPosts(String query) {
        return userMapper.selectOpenPostQByQuery(query);
    }
    public List<PostSearchDTO> findSearchQuestionPosts(String query) {
        return userMapper.selectQuestionPostQByQuery(query);
    }
    public List<QuizVO> findSearchQuizzes(String query) {
        return userMapper.selectQuizByQuery(query);
    }
}