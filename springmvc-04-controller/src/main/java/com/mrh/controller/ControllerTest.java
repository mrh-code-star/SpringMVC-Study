package com.mrh.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerTest implements org.springframework.web.servlet.mvc.Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv = new ModelAndView();

        mv.addObject("msg","TestController1");

        mv.setViewName("test");
        return mv;
    }
}
