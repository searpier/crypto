package com.example.crypto.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/goSignup")
    public String goSignup(){
        return "signup";
    }

    @GetMapping("/goLogin")
    public String goLogin(){
        return "login";
    }

    @GetMapping("/goPay")
    public String goPay(){
        return "pay";
    }

    @GetMapping("/goMarket")
    public String goMarket(){
        return "market";
    }

    @GetMapping("/goHistory")
    public String goHistory(){
        return "history";
    }
}
