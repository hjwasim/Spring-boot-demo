package com.example.jpainheritence.controller;

import com.example.jpainheritence.entity.EntityA;
import com.example.jpainheritence.entity.EntityB;
import com.example.jpainheritence.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Hjwasim
 */
@RestController
public class DemoController {
    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping(path = "/a")
    public List<EntityA> getAAttributes() {
        String type = "JAVA";
        return demoService.getA(type);
    }

    @GetMapping(path = "/b")
    public List<EntityB> getBAttributes() {
        String type = "SQL";
        return demoService.getB(type);
    }

    @GetMapping(path = "/b/{number}")
    public EntityB getBNumber(@PathVariable int number) {
        return demoService.getBFromNumber(number);
    }
}
