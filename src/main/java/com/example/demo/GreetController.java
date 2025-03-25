package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

    @GetMapping("/greet")
    public String greet(Model model) {
        String message = "Ласкаво просимо до Spring Boot!";
        model.addAttribute("message", message);
        return "greet"; // Назва шаблону
    }
}
