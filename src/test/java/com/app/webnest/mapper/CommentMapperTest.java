package com.app.webnest.mapper;

import com.app.webnest.domain.dto.CommentDTO;
import com.app.webnest.domain.dto.PostResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class CommentMapperTest {

    @Autowired
    CommentMapper commentMapper;
    @Test
    void selectByPostIfd() {
        commentMapper.selectByPostId(1L).stream().map(CommentDTO::toString).forEach(log::info);
    }
}