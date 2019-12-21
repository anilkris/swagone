package com.myc.swag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
@RequestMapping(path="/api")
public class HelloController {

    @GetMapping(path="/")
    public String hello() {
        return "hello";
    }

    
}