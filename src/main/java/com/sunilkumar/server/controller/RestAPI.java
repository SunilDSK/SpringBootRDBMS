package com.sunilkumar.server.controller;

import com.sunilkumar.server.dao.UserDAO;
import com.sunilkumar.server.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
class RestAPI {

    @Autowired
    UserDAO userDAO;

    @GetMapping("/hello/{request}")
    private String hello(@PathVariable("request") String string) throws InterruptedException {
        Thread.sleep(1000);
        return "This is from server: " + string;
    }

    @PostMapping("/add-user")
    private Users addUser(@RequestBody Users user) {
        return userDAO.addUser(user);
    }
}
