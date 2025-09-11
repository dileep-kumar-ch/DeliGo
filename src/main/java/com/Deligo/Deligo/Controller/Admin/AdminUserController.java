package com.Deligo.Deligo.Controller.Admin;

import com.Deligo.Deligo.Entity.Users;
import com.Deligo.Deligo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/adminc")
public class AdminUserController {
        @Autowired
        private UserService userv;

    @GetMapping("/getUser/{id}")
    Optional<Users> getUser(@PathVariable int id) {
       Optional<Users> userr = userv.getUser(id);
        return userr;
    }
    //List all users
    //
    //Create a new user (e.g. admin creates another admin or customer)
    //
    //Update user details
    //
    //Delete user
}
