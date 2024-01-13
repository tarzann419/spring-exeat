package dev.springexeat.controller;


import dev.springexeat.models.StudentModel;
import dev.springexeat.service.CustomUserDetail;
import dev.springexeat.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
public class StudentController {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    StudentService studentService;

    @GetMapping("/student/new-application")
    public String newApplicationPage(Model model, Principal principal) {
        CustomUserDetail customUserDetail = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        String matNo = customUserDetail.getMatNo();

        StudentModel studentModel = new StudentModel();
        studentModel.setMatNo(matNo);

        model.addAttribute("student", studentModel);
        model.addAttribute("user", customUserDetail);
        return "content/new_application";
    }

    @PostMapping("/student/save-application")
    public String saveApplication(@ModelAttribute("student") StudentModel student, RedirectAttributes redirectAttributes){
        studentService.saveApplication(student);
        redirectAttributes.addFlashAttribute("message", "Application submitted successfully");

        return "redirect:/student-page";
    }

}
