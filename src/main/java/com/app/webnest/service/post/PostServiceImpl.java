package com.app.webnest.service.post;

import com.app.webnest.domain.dto.PostResponseDTO;
import com.app.webnest.exception.PostException;
import com.app.webnest.repository.post.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostDAO postDAO;

    @Override
    public PostResponseDTO getPost(Long id) {
        //        postDAO.updateReadCount(id);
        return postDAO.findPost(id).orElseThrow(()-> new PostException("Post Not Found"));
    }

    @Override
    public List<PostResponseDTO> getPosts() {
        return postDAO.findPosts();
    }

    @Override
    public List<PostResponseDTO> getPostsByUserId(Long userId) {
        return postDAO.findPostsByUserId(userId);
    }


}
