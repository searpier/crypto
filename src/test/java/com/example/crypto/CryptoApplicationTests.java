package com.example.crypto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CryptoApplicationTests {

    @Autowired
    private TimeMapper timeMapper;

    @Test
    void contextLoads() {
        System.out.println("timeMapper class name: " + timeMapper.getClass().getName());
        System.out.println("timeMapper time: " + timeMapper.selectExample());
    }

}
