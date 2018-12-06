package com.demo.controller;


import com.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/v1")
public class DemoController {

    Logger logger = Logger.getLogger(RestController.class.getName());

    @GetMapping(value = "/users")
    public List<com.demo.model.User> getUser(){

        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Name1"));
        users.add(new User(2L, "Name2"));

        logger.info(">> Returning 2 users.");
        return users;
    }

}
