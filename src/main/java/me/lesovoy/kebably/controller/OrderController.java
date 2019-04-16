package me.lesovoy.kebably.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

    @GetMapping("/")
    public String menu(Model model, @RequestParam(value = "name", required = false, defaultValue = "Kebob") String name) {
        model.addAttribute("name", name);
        return "menu";
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String order() {
        return null;
    }
}
