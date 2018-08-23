package com.example.ivan.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    private volatile int counter = 0;

    @GetMapping("/hi")
    public String hello() {
        counter++;
        log.info("Count of requests: {}", counter);
        if (counter > -1) {
            throw new RuntimeException();
        }
        return "Hi Ivan!";
    }
}
