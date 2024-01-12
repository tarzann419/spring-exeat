package dev.springexeat.controller;


import dev.springexeat.dto.UserDto;
import dev.springexeat.models.UserModel;
import dev.springexeat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @PostMapping("/register")
    public String saveUser(@ModelAttribute ("user") UserDto user, Model model){
        userService.saveUser(user);
        model.addAttribute("message", "Registered Successfuly!");
        model.addAttribute("color", "success");
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}
