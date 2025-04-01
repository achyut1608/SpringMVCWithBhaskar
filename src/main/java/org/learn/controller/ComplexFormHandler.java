package org.learn.controller;


import org.learn.model.ComplexForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComplexFormHandler {

    @GetMapping("/handle")
    public ModelAndView handleForm(@ModelAttribute("complexform") ComplexForm form){
        System.out.println(form);
        ModelAndView modelAndView = new ModelAndView();


        return modelAndView;
    }
}
