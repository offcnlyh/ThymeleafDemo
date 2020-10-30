package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller

public class HelloThymeleaf {

    @GetMapping("/hello")
    public String helloPage(Model model){
        model.addAttribute("msg","今天10月29日");
        return "hello";
    }

    @GetMapping("/getUser")
    public String getUser(Model model){
        User user = new User(2021, 20, "巨婴");
        model.addAttribute("user",user);
        Map<String,String> map = new HashMap<>();
        map.put("iphone12","88888");
        map.put("address","成都市红光镇");
        model.addAttribute("map",map);
        return "showUser";
    }

    @GetMapping("/showList")
    public String showList(Model model){
        List<User> list = new ArrayList<>();
        list.add(new User(2020,18,"小红"));
        list.add(new User(2021,19,"小白"));
        list.add(new User(2022,20,"小兰"));
        list.add(new User(2023,21,"小鬼"));
        model.addAttribute("list",list);
        model.addAttribute("username","小花");
        return "list";
    }

    @GetMapping("/showIsOrNot")
    public String showIsOrNot(Model model){
        model.addAttribute("flag","no");
        return "yesOrNot";
    }

    @GetMapping("/showSwitch")
    public String showSwitch(Model model){
        model.addAttribute("auth","admin");
        model.addAttribute("manager","manager");
        return  "showSwitch";
    }

    @GetMapping("/showImage")
    public String showImage(){
        return "showImage";
    }

    @GetMapping("showIndex")
    public String  showIndex(){
        return "index";
    }

    @GetMapping("/showInnerObject")
    public String showInnerObject(Model model){
         model.addAttribute("date",new Date());
         model.addAttribute("price",135.789D);
         model.addAttribute("text","《英雄联盟》英文名：League Of LegendsL-O-L，简称LOL。\n" +
                 "小撸怡情 久撸伤身，樯橹则灰飞烟灭 ");
        return "showInnerObj";
    }

}
