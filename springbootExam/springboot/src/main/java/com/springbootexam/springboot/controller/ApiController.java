package com.springbootexam.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootexam.springboot.service.ApiService;


@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/api/time")
    public String getNationalTime(){
        return apiService.getDataFromMultipleApis();
    }


}
