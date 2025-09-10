package com.Deligo.Deligo.Service;

import com.Deligo.Deligo.Dtos.loginDto;
import com.Deligo.Deligo.Entity.Users;
import com.Deligo.Deligo.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;

@Service
public class UserServiceImplementation implements UserService{
    @Autowired
   private UserRepo repo;

    @Override
    public void register(Users u) {
        repo.save(u);
    }

    @Override
    public String login(loginDto l) {

    Users us = repo.findByEmail(l.getEmail());
    if(us.getPassword() .equals(l.getPassword())) {
        return "Login Success";
    }
    return "Login Failed";
    }
}
