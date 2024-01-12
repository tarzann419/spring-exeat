package dev.springexeat.controller;


import dev.springexeat.dto.UserDto;
import dev.springexeat.models.UserModel;
import dev.springexeat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
public class UserController {
    @Autowired
    UserDetailsService userDetailsService;

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

    @GetMapping("admin-page")
    public String adminPage(Model model, Principal principal){
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "admin_page";
    }

    @GetMapping("student-page")
    public String studentPage(Model model, Principal principal){
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "student_page";
    }
}
