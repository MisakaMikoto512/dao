package com.mzy.test1;

import com.mzy.mapper.SearchMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SearchMapperTest {
    @Autowired
    private SearchMapper mapper;
    @Test
    void stationSearch() {
        mapper.stationSearch("广州","福州").forEach(System.out::println);
    }
}