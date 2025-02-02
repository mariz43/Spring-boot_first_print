package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/sayhello")
public String sayHello(@RequestParam (value = "myName", defaultValue = "World") String name) {
    
    return "Hello "+ name +"!";
}
}
