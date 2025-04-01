package org.learn.controller;


import org.learn.model.ComplexForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComplexFormHandler {

    @GetMapping("/handle")
    public ModelAndView handleForm(@ModelAttribute ComplexForm form, Model model){
        System.out.println("inside the handle method");
        System.out.println(form);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("successregistration");
        return modelAndView;
    }
}
