package me.lesovoy.kebably.controller;

import me.lesovoy.kebably.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

    @GetMapping("/")
    public String menu(Model model, @RequestParam(value = "name", required = false, defaultValue = "Kebob") String name) {
        model.addAttribute("name", name);
        return "menu";
    }

    @PostMapping("/")
    public String order(Model model, @ModelAttribute Order order) {
        model.addAttribute("name", null);
        System.out.println(order.toString());
        //TODO: implement form field mapping into internal model classes
        //TODO: generate qrcode to /resources/img/qr.png

        return "menu";
    }
}
