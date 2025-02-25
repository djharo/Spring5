package com.curso.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Hello Controller";
    }
    @ResponseBody
    @GetMapping("/getGreeting")
    public String getHello() {
        return "Hello Controller";
    }
}
