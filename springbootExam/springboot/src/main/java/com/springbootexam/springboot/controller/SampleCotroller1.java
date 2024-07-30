package com.springbootexam.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleCotroller1 {
    
    @GetMapping("/user/userinfo")
    public String uerInfo(){
        return "/user/userinfo";
    }

    @GetMapping("/user/userdata")
    public String userData(Model model) {

        model.addAttribute("username", "홍길동");
        //뷰페이지 단으로 데이터(modle) 전달

        return "/user/userinfo";
    }

    /*
     * required = true 옵션은 디폴트가 true이고 써놓지 않으면 디폴트값으로 true 적용(입력되지않으면 오류 400)
     * 이 경우에는 반드시 주소창에 userid 파라미터 값을 넣어서 Http 요청을 넣어야 한다. 안그러면 페이지 에러 발생
     * http://localhost:8090/user/userid?userid=홍길동
     * 
     * 만약 false 로 지정하면 파라미터 값을 넣지 않고 요청을 해도 페이지 에러가 발생하지 않는다.
     */
    @GetMapping("/user/userid")
    public String userId(@RequestParam(value="userid",required = false) String uid, Model model) {
       
        model.addAttribute("userid", uid);
        return "/user/userinfo"; //userinfo.html
    }

    @GetMapping("/user/userparams")
    public String userParams
              (@RequestParam("userid" ) String uid, 
               @RequestParam("username")  String uname, 
               @RequestParam("email")  String uemail,
               @RequestParam("cellphone")  String ucp,
               Model model){
        model.addAttribute("userid", uid);
        model.addAttribute("username", uname);
        model.addAttribute("email", uemail);
        model.addAttribute("cellphone", ucp);
        return "/user/userinfo";
    }
}
