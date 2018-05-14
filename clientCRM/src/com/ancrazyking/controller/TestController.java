package com.ancrazyking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ancrazyking
 * @date 2018/5/14 9:50
 **/
@Controller
@RequestMapping("/Hello")
public class TestController
{

    @RequestMapping("/test")
    public String test(){

        return "test";
    }





}
