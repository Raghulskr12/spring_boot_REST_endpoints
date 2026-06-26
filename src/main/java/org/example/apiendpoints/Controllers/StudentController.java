package org.example.apiendpoints.Controllers;


import org.example.apiendpoints.Modals.Student;
import org.example.apiendpoints.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService StudentService;

    @GetMapping("/")
    public String hello() {
        return "welcome!";
    }

    @GetMapping("/student")
    public List<Student> GetStudents() {
        return StudentService.ListStudents();
    }

    @GetMapping("/student/{RollNo}")
    public Student GetStudent(@PathVariable String RollNo) {
        return StudentService.GetStudent(RollNo);
    }
}
