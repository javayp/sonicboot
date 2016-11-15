package com.sonic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by prash on 11/9/2016.
 */
@RestController
public class PageController {
    @RequestMapping("/")
    public String pagecontroller(){
        return "pagecontroller";
    }
}
