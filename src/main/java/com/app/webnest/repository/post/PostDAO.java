package com.app.webnest.repository.post;

import com.app.webnest.domain.dto.PostResponseDTO;
import com.app.webnest.mapper.post.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostDAO {

    private final PostMapper postMapper;
    // 게시글 단일 조회
    public Optional<PostResponseDTO> findPost(Long id) {
        return postMapper.select(id);
    }

    // 게시글 전체 조회
    public List<PostResponseDTO> findPosts(){
        return postMapper.selectAll();
    }

    // 내가 쓴 글 전체 조회
    public List<PostResponseDTO> findPostsByUserId(Long userId){
        return postMapper.selectAllByUserId(userId);
    }
}
