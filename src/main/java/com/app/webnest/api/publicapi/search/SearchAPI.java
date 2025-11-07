package com.app.webnest.api.publicapi.search;

import com.app.webnest.domain.dto.ApiResponseDTO;
import com.app.webnest.domain.dto.search.SearchResultResponseDTO;
import com.app.webnest.domain.vo.PostVO;
import com.app.webnest.domain.vo.QuizVO;
import com.app.webnest.domain.vo.UserVO;
import com.app.webnest.service.search.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/search")
public class SearchAPI {
    private final SearchService searchService;

    @GetMapping("/")
    public ResponseEntity<ApiResponseDTO> searchResult(@PathVariable String query) {
        SearchResultResponseDTO searchResultResponseDTO = searchService.getSearchResult(query);
        List<PostVO> foundPosts = searchResultResponseDTO.getPosts();
        List<QuizVO> foundQuizzes = searchResultResponseDTO.getQuizzes();
        List<UserVO> foundUsers = searchResultResponseDTO.getUsers();
        List<PostVO> openPosts = foundPosts.stream()
                .filter((post) -> post.getPostType().equals("OPEN"))
                .collect(Collectors.toList());;

        Set<String> allowed = Set.of("JS", "ORACLE", "JAVA");

        List<PostVO> questionPosts = foundPosts.stream()
                .filter(p -> allowed.contains(p.getPostType()))
                .collect(Collectors.toList());

        int questionPostsCount = questionPosts.size();
        int openPostsCount = openPosts.size();
        int quizzesCount = searchResultResponseDTO.getQuizzes().size();
        int usersCount = searchResultResponseDTO.getUsers().size();

        Integer totalCount = questionPostsCount + openPostsCount + usersCount + quizzesCount;

        Map<String, Object> result = new HashMap<>();
        if(totalCount > 0){
            if(questionPostsCount > 0){
                result.put("questionPosts", questionPosts);
            }
            if(openPostsCount > 0){
                result.put("openPosts", openPosts);
            }
            if (quizzesCount > 0){
                result.put("quizzes", foundQuizzes);
            }
            if(usersCount > 0){
                result.put("users", foundUsers);
            }
        }
        result.put("total", totalCount);
        result.put("search", query);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("검색 결과", result));
    }
}
