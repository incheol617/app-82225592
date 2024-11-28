package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1/user")
@RestController
public class UserController {
	
    /**
     * USER 사번을 리턴
     * @return ID
     */
    @GetMapping 
    public String getUser() {
        log.info(" :: Call getUser() :: ");
        return "82225592"; // 사번을 리턴 
    }
    
}
