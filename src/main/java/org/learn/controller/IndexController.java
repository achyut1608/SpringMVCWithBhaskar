package org.learn.controller;

import org.learn.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("name","Testing");
        model.addAttribute("id",123908);
        List<String> testValue = new ArrayList<>();
        testValue.add("Test1");
        testValue.add("Test2");
        testValue.add("Test3");
        testValue.add("Test4");
        model.addAttribute("list",testValue);
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model){
        Person person =new Person();
        person.setId(1);
        person.setName("Name");
        model.addAttribute("person",person);
        return "about";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }


    @GetMapping("/userregistration")
    public String userRegistration(){
        return "userregistration";
    }



}
