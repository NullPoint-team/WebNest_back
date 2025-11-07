package com.app.webnest.service.search;

import com.app.webnest.domain.dto.search.SearchResultResponseDTO;
import com.app.webnest.domain.vo.PostVO;
import com.app.webnest.domain.vo.QuizVO;
import com.app.webnest.domain.vo.UserVO;

import java.util.List;

public interface SearchService {

//  검색어와 일치한 게 있는 posts / quizzes / users 조회
    public SearchResultResponseDTO getSearchResult(String query);

}
