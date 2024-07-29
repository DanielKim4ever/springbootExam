package com.springbootexam.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleCotroller2 {
    

    @PostMapping("/post")
    public String demoPost(
           @RequestParam String membername,
           @RequestParam String memberid,
           @RequestParam String memberemail,
           Model model){
         model.addAttribute("membername",membername);
         model.addAttribute("memberid",memberid);
         model.addAttribute("memberemail",memberemail);
         /*
          *@RequestBody 는 전달된 데이터를 일괄로 묶어서 출력 
          *
          */

         return "/post/post";
    }
}
