package com.springbootexam.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class firstController{

    @GetMapping("/home")
    public String homeMethod(){
        return "home";
    }

    @GetMapping("/memeber/add")
    public String memberMethod() {
        return "member/add";
    }

}