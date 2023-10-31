package com.hjwasim.springgraceshutdown.controller;

import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hjwasim
 */
@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    private void threadProcess() {
        Thread t = new Thread(() -> {
            try {
                LOGGER.info("Thread - execution started.");
                Thread.sleep(5000); //5 seconds to return a resp.
                LOGGER.info("Thread - execution completed.");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t.start();
    }

    @GetMapping("1")
    public String hello1() throws InterruptedException {
        LOGGER.info("Controller 1 - execution started.");
        Thread.sleep(5000); //5 seconds to return a resp.
        LOGGER.info("Controller 1 - execution completed.");
        return "Hello Spring!";
    }

    @GetMapping("2")
    public String hello2() throws InterruptedException {
        LOGGER.info("Controller 2 - execution started.");
        threadProcess();
        LOGGER.info("Controller 2 - execution completed.");
        return "Hello Spring!";
    }
}
