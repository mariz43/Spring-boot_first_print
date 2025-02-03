package com.example.demo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @PostMapping("/greet")
public String greetUser(@RequestBody User user){ //user is the object of the class user
    
    return "Hello " + user.getName() + "! You are"+user.getAge() + " years old";
}
}
