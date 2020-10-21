package com.mrh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

//    http://localhost:8080/add?a=2&b=5
    @RequestMapping("/add")
    public String test1(int a, int b, Model model) {
        int res = a + b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
//    @RequestMapping(value = "/add1/{a}/{b}",method = RequestMethod.GET)
//    @RequestMapping(value = "/add1/{a}/{b}",method = RequestMethod.DELETE)
    @PostMapping("/add1/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg","结果1为"+res);
        return "test";
    }
    @GetMapping("/add1/{a}/{b}")
    public String test3(@PathVariable int a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg","结果2为"+res);
        return "test";
    }


}
