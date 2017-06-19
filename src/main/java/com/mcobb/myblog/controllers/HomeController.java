package com.mcobb.myblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public  String hello(Model model){
        /*
         This is just a skeleton this will change and morph with
         the project.
         */
        model.addAttribute("name", "World");
        return "home";
    }
}
