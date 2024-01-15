package dev.springexeat.controller.api;

import dev.springexeat.models.StudentModel;
import dev.springexeat.repository.StudentRepository;
import dev.springexeat.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentAPIController {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentService studentService;

    @RequestMapping("/api/students")
    @GetMapping("/api/students")
    public ResponseEntity<List<StudentModel>> getAllStudents(){return ResponseEntity.ok().body(studentRepository.findAll());
    }

    @RequestMapping("/api/students/{id}")
    @GetMapping
    public ResponseEntity<StudentModel> getStudentById(@PathVariable long id){
        return ResponseEntity.ok().body(studentService.getApplicationById(id));
    }

    @PostMapping("/api/student")
    public ResponseEntity<StudentModel> createStudent(@RequestBody StudentModel student){
        return ResponseEntity.ok().body(studentService.saveApplication(student));
    }

    @PutMapping("/api/student/{id}")
    public ResponseEntity<StudentModel> updateStudent(@PathVariable long id, @RequestBody StudentModel student){
        return ResponseEntity.ok().body(studentService.updateApplicationById(student));
    }
}
