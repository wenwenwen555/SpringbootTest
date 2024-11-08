package com.kun.springboottest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("login")
    public String login(){
        return "login success!";
    }
    @RequestMapping("logout")
    public String logout(){
        return "logout success!!!";
    }
}
