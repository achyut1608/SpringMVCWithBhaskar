package org.learn.controller;

import org.learn.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {


    /**
    @PostMapping("/signup")
    // @RequestPAram name should be same as name of the formfieldName
    //Note : in form fields name is required
    public String signup(@RequestParam(name="txtEmail") String txtEmail, @RequestParam(name="txtUsername") String txtUsername, @RequestParam(name="txtPassword") String txtPassword, Model model){
        System.out.println("Email : " + txtEmail + " username  : " + txtUsername + "password : " + txtPassword);
        model.addAttribute("email",txtEmail);
        model.addAttribute("username",txtUsername);
        model.addAttribute("password",txtPassword);
        return "successsignup";
    }*/

    @PostMapping("/signup")
    //Note name should be exactly matched in Model class's fields(eg.user( txtEmail at both places(in form and Model class)))
    public String signup(@ModelAttribute User user, Model model){
        return "successsignup";
    }



}
