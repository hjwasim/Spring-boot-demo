package com.hjwasim.springcache.controller;

import com.hjwasim.springcache.domain.User;
import com.hjwasim.springcache.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/get")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

}
