package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    
    @GetMapping("/register")
    public String showRegistrationForm(User user) {
        return "registrationForm";
    }
    
    @PostMapping("/register")
    public String registerUser(User user) {
        // 处理用户注册逻辑
        return "redirect:/registrationSuccess";
    }
}
