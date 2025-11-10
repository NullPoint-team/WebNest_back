package com.app.webnest.service.search;


import com.app.webnest.domain.dto.search.PostSearchDTO;
import com.app.webnest.domain.vo.QuizVO;
import com.app.webnest.domain.vo.UserVO;

import java.util.List;

public interface SearchService {

    public List<PostSearchDTO> getOpenPostBySearchQuery(String searchQuery);

    public List<PostSearchDTO> getQuestionPostBySearchQuery(String searchQuery);

    public List<QuizVO> getQuizBySearchQuery(String searchQuery);

    public List<UserVO> getUserBySearchQuery(String searchQuery);
}
