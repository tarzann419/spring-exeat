package dev.springexeat.controller.api;

import dev.springexeat.models.StudentModel;
import dev.springexeat.models.UserModel;
import dev.springexeat.repository.UserRepository;
import dev.springexeat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserAPIController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @RequestMapping("/users")
    @GetMapping("/users")
    public ResponseEntity<List<UserModel>> getAllUsers(){return ResponseEntity.ok().body(userRepository.findAll());
    }

    @RequestMapping("/users/{id}")
    @GetMapping
    public ResponseEntity<UserModel> getUserById(@PathVariable long id){
        return ResponseEntity.ok().body(userService.getApplicationById(id));
    }

    @PostMapping("/user")
    public ResponseEntity<StudentModel> createStudent(@RequestBody StudentModel student){
        return ResponseEntity.ok().body(userService.saveApplication(student));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<StudentModel> updateStudent(@PathVariable long id, @RequestBody StudentModel student){
        return ResponseEntity.ok().body(userService.updateApplicationById(student));
    }
}
