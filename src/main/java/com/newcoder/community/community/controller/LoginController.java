package com.newcoder.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xyb
 * @create 2022-06-15 15:18
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String getRegisterPage(){

        return "/site/register";
    }

}
