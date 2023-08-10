package com.osoree.marketapp;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home/main_index";
    }

    @GetMapping("/index")
    public String home(){
        return "home/main_index";
    }
}
