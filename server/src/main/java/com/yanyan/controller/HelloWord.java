package com.yanyan.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloWord {

    @GetMapping("/word")
    public String getHello(){
        return "欢迎你啊啊的 ";
    }
}
