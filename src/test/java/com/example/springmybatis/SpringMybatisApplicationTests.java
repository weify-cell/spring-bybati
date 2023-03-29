package com.example.springmybatis;

import com.example.springmybatis.dao.HelloDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMybatisApplicationTests {

    @Autowired
    private HelloDao helloDao;

    @Test
    void contextLoads() {
    }


}
