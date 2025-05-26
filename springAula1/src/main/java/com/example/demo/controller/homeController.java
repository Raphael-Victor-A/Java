package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
public class homeController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("mensagem de bem vindo", "toma gap");
        return "index";
    }
}
