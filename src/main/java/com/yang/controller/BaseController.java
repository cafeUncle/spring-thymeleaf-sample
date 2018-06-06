package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

/**
 * @author yangyao
 */
@Controller
public class BaseController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("urlText", "这是一个后台转发的页面头---------哈哈哈哈？");
        int[] arr = {0,1,2};
        String[] list = {"a", "b", "c"};
        model.addAttribute("jsCode", "show");
        model.addAttribute("stuStatus", arr[new Random().nextInt(3)]);
        model.addAttribute("list", list);
        model.addAttribute("cssName", "hello");
        model.addAttribute("submitBtn", "登录");
        model.addAttribute("cssStyle", "appendCssItem");
        model.addAttribute("active", true);
        return "hello";
    }
}