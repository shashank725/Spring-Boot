package com.springboot.demo.res;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunResController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamname;

    @GetMapping("/teamInfo")
    public String getTeamInfo() {
        return "Coach: "+coachName+"   Team Name "+teamname;
    }
}
