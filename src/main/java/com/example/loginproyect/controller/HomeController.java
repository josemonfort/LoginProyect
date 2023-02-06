package com.example.loginproyect.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/user")
    public String user() {
        return "Hola user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hola admin!";
    }
}
