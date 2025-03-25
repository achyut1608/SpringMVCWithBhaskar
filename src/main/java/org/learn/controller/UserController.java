package org.learn.controller;

import org.learn.model.User;
import org.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {


    @Autowired
    UserService service;

    @PostMapping("/register")
    public ModelAndView signUp(@ModelAttribute User user, Model model){
    //public RedirectView signup(@ModelAttribute User user,Model model){
        // checking for validation
        ModelAndView view = new ModelAndView();
        if(user.getTxtEmail().isEmpty()){
            System.out.println("in user redirect");
            view.setViewName("redirect:/registerError");
            return view;
            //return "redirect:/register";
        }




        service.save(user);
        view.setViewName("successregistration");
        return view;
        //return "successregistration";
    }

    @PostMapping("registerError")
    public ModelAndView getRedirect(){
        ModelAndView view = new ModelAndView();
        view.setViewName("register");
        return view;
    }

}
