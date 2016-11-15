package com.sonic.exceptionHandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by prash on 11/14/2016.
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String exception(Exception exception,Model model){
        model.addAttribute("exception",exception);
        return "errorHandler";
    }
}
