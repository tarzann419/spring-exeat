package dev.springexeat.controller;


import dev.springexeat.dto.UserDto;
import dev.springexeat.models.UserModel;
import dev.springexeat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/register")
    public String getRegistrationPage(@ModelAttribute("user") UserDto user){
        return "register";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute ("user") UserDto user, RedirectAttributes redirectAttributes){
        userService.saveUser(user);
        redirectAttributes.addFlashAttribute("message", "Registration Successful");
        redirectAttributes.addFlashAttribute("color", "success");
        return "register";
    }
}
