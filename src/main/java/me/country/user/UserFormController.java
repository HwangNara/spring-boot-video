package me.country.user;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserFormController {

    @GetMapping("/users/new")
    public String newUserForm() {
        return "users/new";
    }

    @PostMapping("/users/new")
    public String newUserHandler(@ModelAttribute @Valid User user, BindingResult error) {
        if (error.hasErrors()) {
            return "users/new";
        }
        // TODO add
        return "redirect:/users";
    }
}
