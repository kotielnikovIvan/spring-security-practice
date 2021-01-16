package com.mycompany.springsecuritypractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ivan Kotielnikov
 */
@Controller
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/success")
    public String getSuccess() {
        return "success";
    }

}
