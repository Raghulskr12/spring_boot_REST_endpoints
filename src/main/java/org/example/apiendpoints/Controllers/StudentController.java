package org.example.apiendpoints.Controllers;


import org.example.apiendpoints.Modals.Student;
import org.example.apiendpoints.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/student")
    public String AddStudent(@RequestBody Student student) {
        StudentService.AddStudent(student);
        return "Success";
    }
    @PutMapping("/student")
    public String UpdateStudent(@RequestBody Student student) {
        StudentService.UpdateStudent(student);
        return "Success";
    }

    @DeleteMapping("/student/{RollNo}")
    public String DeleteStudent(@PathVariable int RollNo) {
        StudentService.deleteStudent(RollNo);
        return "Success";
    }


}
