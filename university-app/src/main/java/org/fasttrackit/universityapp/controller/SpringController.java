package org.fasttrackit.universityapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringController {

    @GetMapping("/hello")
    public String example() {
        return "Hello world!";
    }


}
