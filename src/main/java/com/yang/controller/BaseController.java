package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yangyao
 */
@Controller
public class BaseController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("urlText", "这是一个后台转发的页面头---------哈哈哈哈？");
        return "hello";
    }
}