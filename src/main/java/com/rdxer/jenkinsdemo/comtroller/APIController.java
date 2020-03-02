package com.rdxer.jenkinsdemo.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/test1")
    public String test1(String name){
        return "name:" + name;
    }
}
