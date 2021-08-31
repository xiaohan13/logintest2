package com.example.login.controller;

import com.example.login.DAO.UserRepository;
import com.example.login.entities.User;
import com.example.login.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/doregister")
    public String register(HttpServletRequest request, User user){
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        if (password.equals(password2)){
            if(registerUser(email)==true){
                User user1 = new User();
                user1.setEmail(email);
                user1.setPassword(password);
                userService.save(user1);
                return "login";
            }else {
                return "register";
            }
        }else {
            return "register";
        }
    }

    public boolean registerUser(String email){
      return true;
    }


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/dologin", method= RequestMethod.POST ,produces = "application/json")
    public String login(HttpServletRequest request){
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = userService.findByEmail(email).get(0);

        if (user.getPassword().equals(password)){
            return "success";
        }else {
            return "login";
        }

    }
}
