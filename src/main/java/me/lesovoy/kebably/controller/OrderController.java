package me.lesovoy.kebably.controller;

import me.lesovoy.kebably.model.Item;
import me.lesovoy.kebably.model.Property;
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
    public String order(Model model, @ModelAttribute(value = "item") Item item) {

        item.addProperty(new Property("size", "L"));
        model.addAttribute("name", null);
        System.out.println(item.getName());
        //TODO: implement form field mapping into internal model classes https://medium.com/@grokwich/spring-boot-thymeleaf-html-form-handling-762ef0d51327
        //TODO: generate qrcode to /resources/img/qr.png

            return "qr";
    }

}
