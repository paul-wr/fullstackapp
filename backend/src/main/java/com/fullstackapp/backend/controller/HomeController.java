package com.fullstackapp.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${application-version}")
    private String version;
    @RequestMapping("/")
    public String home(){
        return "Application version: " + version;
    }
}
