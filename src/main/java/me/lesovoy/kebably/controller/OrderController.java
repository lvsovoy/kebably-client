package me.lesovoy.kebably.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @GetMapping("/")
    public String menu(Model model) {
        return "menu";
    }

    @PostMapping("/")
    public String order(Model model) {
        return "menu";
    }

}
