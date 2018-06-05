package com.yang.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletContext;

/**
 * @author yangyao
 */
@ControllerAdvice(basePackages = {"com.yang.controller"})
public class PageController {

    @ModelAttribute("timestamp")
    public Long timestampInit() {
        System.out.println("timestampInit");
        return System.currentTimeMillis();
    }

    @ModelAttribute("ctx")
    public String ctx(ServletContext context) {
        System.out.println(context.getContextPath());
        return context.getContextPath();
    }
}
