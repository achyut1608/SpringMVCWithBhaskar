package org.learn.controller;

import org.learn.model.User;
import org.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    @Autowired
    UserService service;

    @PostMapping("/register")
    public String signUp(@ModelAttribute User user,Model model){
        service.save(user);

        return "successregistration";
    }

}
