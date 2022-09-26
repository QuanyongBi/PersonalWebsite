package com.jason.PersonalWebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainpageController {

    @RequestMapping(path = "/")
    public String main_page(){
        return "main_page";
    }
}
