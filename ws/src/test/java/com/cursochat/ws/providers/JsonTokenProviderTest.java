package com.cursochat.ws.providers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class JsonTokenProviderTest {

    @Autowired
    TokenProvider tokenProvider;

    @Test
    void test(){
        Map<String, String> decoded = tokenProvider.decode("token-invalido");
        System.out.println(decoded);
    }
}
