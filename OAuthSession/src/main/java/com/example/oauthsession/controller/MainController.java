package com.example.oauthsession.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class MainController {

    @GetMapping("/")
    public String mainPage() {

        return "main";
    }
}
