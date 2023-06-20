package com.example.speing1000;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello David";
    }
}