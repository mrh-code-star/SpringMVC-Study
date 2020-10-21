package com.mrh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c1")
public class ControllerTest3 {

    @RequestMapping("/t2")
    public String test3(Model model){
        model.addAttribute("msg","Hello,ControllerTest3");

        return "test";
    }
}
