package com.sonic.controllers;

import com.sonic.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by prash on 11/9/2016.
 */
@Controller
@RequestMapping("/posts")
public class PostController {

    @RequestMapping("/")
    public String listModel(Model model){

        return "views/list";
    }

}
