package com.Deligo.Deligo.Service;

import com.Deligo.Deligo.Dtos.loginDto;
import com.Deligo.Deligo.Entity.Users;


public interface UserService {
    void register(Users u);
    String login(loginDto l);
}
