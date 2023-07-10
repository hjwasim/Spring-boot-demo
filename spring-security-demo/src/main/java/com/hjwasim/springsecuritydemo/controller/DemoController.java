package com.hjwasim.springsecuritydemo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hjwasim
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String hello(){
        var u = SecurityContextHolder.getContext().getAuthentication();
        u.getAuthorities().forEach(a -> System.out.println(a.getAuthority().toLowerCase()));
        return "Hello Spring Security!";
    }
}
