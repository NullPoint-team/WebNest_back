package com.app.webnest.api.privateapi.postApi;

import com.app.webnest.domain.dto.ApiResponseDTO;
import com.app.webnest.domain.dto.PostResponseDTO;
import com.app.webnest.domain.vo.PostVO;
import com.app.webnest.service.post.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/post/*")
public class PostApi {

    private final PostService postService;

//    @PostMapping("write")
//    public ResponseEntity<ApiResponseDTO> writePost(@RequestBody PostVO postVO) {
//        Map<String, Long> response = postService.write(postVO);
//        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponseDTO.of("게시글 작성 완료", response));
//    }

    @GetMapping("get-post/{id}")
    public ResponseEntity<ApiResponseDTO> getPost(@PathVariable Long id) {
        PostResponseDTO post = postService.getPost(id);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 조회 성공", post));
    }

    @GetMapping("get-posts")
    public ResponseEntity<ApiResponseDTO> getPosts() {
        List<PostResponseDTO> posts = postService.getPosts();
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 목록 조회 성공", posts));
    }

    @GetMapping("get-my-posts")
    public ResponseEntity<ApiResponseDTO> getMyPosts(@RequestBody Long id) {
        List<PostResponseDTO> posts = postService.getPostsByUserId(id);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 목록 조회 성공", posts));
    }

//    @PutMapping("modify")
//    public ResponseEntity<ApiResponseDTO> updatePost(@RequestBody PostVO postVO) {
//        postService.modify(postVO);
//        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 수정 조회 성공"));
//    }
//
//    @DeleteMapping("remove")
//    public ResponseEntity<ApiResponseDTO> updatePost(@RequestBody Long id) {
//        postService.remove(id);
//        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 삭제 성공"));
//    }
}
