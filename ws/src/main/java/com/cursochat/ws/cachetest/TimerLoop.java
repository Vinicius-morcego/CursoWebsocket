package com.cursochat.ws.cachetest;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

@Component
public class TimerLoop {
    /*@Autowired SpringGenerator generator;

    @PostConstruct
    void init(){
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                return;
                String simple = generator.buildSimpleString();
                String cached = generator.buildCachedString();
                System.out.println("Simple: "+simple+" Cache: "+cached);
            }
        },2000L, 2000L);
    }*/
}
