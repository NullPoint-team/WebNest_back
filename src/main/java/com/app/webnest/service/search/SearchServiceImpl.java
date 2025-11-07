package com.app.webnest.service.search;

import com.app.webnest.domain.dto.search.SearchResultResponseDTO;
import com.app.webnest.domain.vo.PostVO;
import com.app.webnest.domain.vo.QuizVO;
import com.app.webnest.domain.vo.UserVO;
import com.app.webnest.repository.search.SearchDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional(rollbackFor=Exception.class)
public class SearchServiceImpl implements SearchService {
    private final SearchDAO searchDAO;

    @Override
    public SearchResultResponseDTO getSearchResult(String query) {
        SearchResultResponseDTO searchResultResponseDTO = new SearchResultResponseDTO();
        List<PostVO> foundPosts = searchDAO.findPostByQuery(query);
        List<UserVO> foundUsers = searchDAO.findUserByQuery(query);
        List<QuizVO> foundQuizzes = searchDAO.findQuizByQuery(query);
        return searchResultResponseDTO;
    }

}
