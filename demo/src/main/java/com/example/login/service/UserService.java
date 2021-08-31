package com.example.login.service;

import com.example.login.DAO.UserRepository;
import com.example.login.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired(required=false)
    UserRepository userRepository;

    public List <User> findByEmail(String email){

        return userRepository.findByEmail(email);
    }

//    public User findByEmailAndPass(String email, String password){
//        return userRepository.findByEmailAndPass(email, password);
//    }

    public void save(User user1){
        userRepository.save(user1);
    }


}
