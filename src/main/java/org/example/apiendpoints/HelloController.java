package org.example.apiendpoints;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    @GetMapping("/about")
    public String about() {
        return "Iam raghul";
    }
}
