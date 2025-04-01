package org.learn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CentralizeExceptionHandler {



    @ExceptionHandler(NumberFormatException.class)
    public String getException(Model model){
        model.addAttribute("msg","Number format exception  has occured");
        return "exception";
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(Exception.class)
    public String notFount(Model m){
        m.addAttribute("msg","file not found");
        return "exception";
    }

}
