package com.javabycode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping(value="/employee/{id}",method= RequestMethod.GET)
    public String getEmployee(@PathVariable String id) {
        return " I am first Employee";
    }

    @RequestMapping("/hello")
    public String index() {
        return "Spring Boot Example";
    }
}
