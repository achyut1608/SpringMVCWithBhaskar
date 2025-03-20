package org.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelpController {

    @GetMapping("/help")
    public ModelAndView getHelp(){
        ModelAndView modelAndView = new ModelAndView();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1234);
        list.add(8907);
        modelAndView.addObject("name","Testing");
        modelAndView.addObject("list",list);
        modelAndView.setViewName("help");
        return modelAndView;
    }


}
