package com.Deligo.Deligo.Controller;

import com.Deligo.Deligo.Dtos.loginDto;
import com.Deligo.Deligo.Entity.Users;
import com.Deligo.Deligo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    String register(@RequestBody Users u) {
    service.register(u);
    return "Registered Successfully";
    }

    @PostMapping("/login")
    String login(@RequestBody loginDto l) {
       String msg =  service.login(l);
        return msg;
    }
}
