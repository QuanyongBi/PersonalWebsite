package com.jason.PersonalWebsite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class artpageController {

    @GetMapping(path = "art_page.html")
    public String art_page(){
        return "art_page";
    }
}
