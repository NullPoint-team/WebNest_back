package com.app.webnest.api.publicapi.search;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Data
class SearchAPITest {
    @Autowired
    SearchAPI searchAPI;

    @Test
    public void testFindUserByQuery() {
        log.info("ㄱ검색결과 :::::::::{}", searchAPI.searchResult("JS"));
    }
}