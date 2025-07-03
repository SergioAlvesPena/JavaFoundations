package com.foundations.foundations;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    public String Home(){
        return "Hello World";
    }
    
}
