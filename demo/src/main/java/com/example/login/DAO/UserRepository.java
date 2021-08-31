package com.example.login.DAO;

import com.example.login.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <User, String>{
    public List<User> findByEmail(String email);
    //public User findByEmailAndPass(String email, String password);

}
