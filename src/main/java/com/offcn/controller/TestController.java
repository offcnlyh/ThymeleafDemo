package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {

     @RequestMapping("/myController")
    public String test(){
         return "myController";
     }
}
