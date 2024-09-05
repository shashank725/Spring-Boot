package com.springboot.demo.res;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunResController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
