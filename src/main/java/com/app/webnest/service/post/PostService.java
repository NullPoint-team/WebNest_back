package com.app.webnest.service.post;

import com.app.webnest.domain.dto.PostResponseDTO;

import java.util.List;


public interface PostService {
    // 상세 페이지 조회
    public PostResponseDTO getPost(Long id);

    //전체 게시글 조회
    public List<PostResponseDTO> getPosts();

    //마이페이지에서 모든 게시글 조회
    public List<PostResponseDTO> getPostsByUserId(Long userId);



}


//    // 게시글 추가
//    public Map<String, Long> write(PostVO postVO);
//
//
//    // 게시글 수정
//    public void modify(PostVO postVO);
//
//    // 게시글 삭제
//    public void remove(Long id);
//}
//
