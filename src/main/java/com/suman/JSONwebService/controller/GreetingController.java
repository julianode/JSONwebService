package com.suman.JSONwebService.controller;

import com.suman.JSONwebService.model.Greetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private AtomicLong lastIdDone = new AtomicLong(); // starts with 0

    @GetMapping("/greetings")
    public Greetings greetings(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greetings(lastIdDone.incrementAndGet(), String.format(template, name));
    }

}
