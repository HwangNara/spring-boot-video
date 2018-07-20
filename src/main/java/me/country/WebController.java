package me.country;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}
