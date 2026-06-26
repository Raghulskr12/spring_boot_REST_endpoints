package org.example.apiendpoints.Controllers;


import org.example.apiendpoints.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService helloService;

    @GetMapping("/")
    public String hello() {
        return helloService.hello();
    }
}
