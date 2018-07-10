package com.heima.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhaodi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {
    @Reference
    UserService userService;
    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){
        return   userService.getName()+"1";
    }

}
