package com.practice.springboot.controller;

import com.practice.springboot.domain.TestEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

    @GetMapping("/rest")
    public Object test(@RequestParam int sequence) {
        return TestEnum.getEnumBySequence(sequence);
    }

}
