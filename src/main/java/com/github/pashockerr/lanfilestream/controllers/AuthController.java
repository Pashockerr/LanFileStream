package com.github.pashockerr.lanfilestream.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthController {
    @GetMapping("/login")
    @ResponseBody
    public String loginIndex(){
        return "Login page!";
    }
}
