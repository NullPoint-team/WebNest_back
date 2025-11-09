package com.app.webnest.mapper;

import com.app.webnest.domain.dto.PostResponseDTO;
import com.app.webnest.mapper.post.PostMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class PostMapperTest {

    @Autowired
    private PostMapper postMapper;

    @Test
    void testSelectAll(){
        postMapper.selectAll();
    }
@Test
    void testSelect(){
        postMapper.select(2L);
        log.info("성공");
    }
    @Test
    void testSelectallbymemberid(){
        postMapper.selectAllByUserId(2L).stream().map(PostResponseDTO::toString).forEach(log::info);
        log.info("성공");
    }

}