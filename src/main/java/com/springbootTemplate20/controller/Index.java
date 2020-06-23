package com.springbootTemplate20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Index {

    @GetMapping(value = "/")
    @ResponseBody
    public String index() {
        return "Hello";
    }

}