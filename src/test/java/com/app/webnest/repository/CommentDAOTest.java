package com.app.webnest.repository;

import com.app.webnest.domain.dto.CommentDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class CommentDAOTest {
    @Autowired
    private CommentDAO commentDAO;
    @Test
    void findPostsByMemberId() {
        commentDAO.findCommentPostId(2L).stream().map(CommentDTO::toString).forEach(log::info);
    }

}