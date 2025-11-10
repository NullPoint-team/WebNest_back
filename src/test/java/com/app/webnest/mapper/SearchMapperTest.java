package com.app.webnest.mapper;

import com.app.webnest.mapper.SearchMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
@Data
class SearchMapperTest {
    @Autowired
    SearchMapper searchMapper;

    @Test
    void selectPostByQuery() {
        searchMapper.selectByQuery("oo");
    }
}