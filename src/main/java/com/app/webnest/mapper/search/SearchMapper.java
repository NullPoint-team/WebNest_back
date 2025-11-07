package com.app.webnest.mapper.search;

import com.app.webnest.domain.vo.PostVO;
import com.app.webnest.domain.vo.QuizVO;
import com.app.webnest.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SearchMapper {
    public List<QuizVO> selectQuizByQuery(String query);

    public List<PostVO> selectPostByQuery(String query);

    public List<UserVO> selectUserByQuery(String query);

}
