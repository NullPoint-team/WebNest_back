package com.app.webnest.repository.post;

import com.app.webnest.domain.dto.PostResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class PostDAOTest {
    @Autowired
    PostDAO postDAO;

//    @Test
//    void findPost() {
//        PostResponseDTO.findPost(24L).map(PostResponseDTO::toString).ifPresent(log::info);
//    }

    @Test
    void findPosts() {
        postDAO.findPosts().stream().map(PostResponseDTO::toString).forEach(log::info);
    }

    @Test
    void findPostsByMemberId() {
        postDAO.findPostsByUserId(2L).stream().map(PostResponseDTO::toString).forEach(log::info);
    }
}




