package com.app.webnest.repository.search;

import com.app.webnest.domain.vo.PostVO;
import com.app.webnest.domain.vo.QuizVO;
import com.app.webnest.domain.vo.UserVO;
import com.app.webnest.mapper.search.SearchMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SearchDAO {
    private final SearchMapper searchMapper;

    public List<PostVO>  findPostByQuery(String query) {
        return searchMapper.selectPostByQuery(query);
    }

    public List<QuizVO> findQuizByQuery(String query) {
        return searchMapper.selectQuizByQuery(query);
    }

    public List<UserVO> findUserByQuery(String query) {
        return searchMapper.selectUserByQuery(query);
    }
}
