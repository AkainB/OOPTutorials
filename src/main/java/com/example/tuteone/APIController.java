package com.example.tuteone;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    @GetMapping("/home")
    public String home() {
        return "Ver 2.5.0";
    }

    @GetMapping("/goodbye")
        public String goodbye(){
            return "Goodbye from Spring Boot!";

    }

    @GetMapping("/test/username")
    public String test(@PathVariable("username")String username){
        if(username.equals("John")) {
            return "Get Lost!";
        }else if(username!=null){
            
        }
    }

}
