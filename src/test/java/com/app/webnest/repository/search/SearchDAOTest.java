package com.app.webnest.repository.search;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class SearchDAOTest {
    @Autowired
    private SearchDAO searchDAO;

    @Test
    public void testSearch() {
        log.info("Testing SearchDAO:::::::::{}",searchDAO.findSearchOpenPosts("니다"));
        log.info("Test:::::::::::::::{}", searchDAO.findSearchUsers("oo"));
        log.info("Test:::::::::::::::{}", searchDAO.findSearchQuestionPosts("JS"));
    }
}