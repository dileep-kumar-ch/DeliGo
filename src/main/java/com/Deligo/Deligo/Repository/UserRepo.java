package com.Deligo.Deligo.Repository;

import com.Deligo.Deligo.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Long> {

    Users findByEmail(String email);
}
