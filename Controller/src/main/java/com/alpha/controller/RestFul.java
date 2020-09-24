package com.alpha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFul {
    @RequestMapping("/add")
    public String test(int a, int b, Model model){
        return "test";
    }
}
