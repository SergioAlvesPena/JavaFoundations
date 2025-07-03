package com.foundations.foundations;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {

    @RequestMapping("/hello", method=RequestMethod.GET)
    public String Home(@RequestParam String param) {
        return "Hello World";
    }
    
}
