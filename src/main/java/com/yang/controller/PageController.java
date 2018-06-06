package com.yang.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author yangyao
 */
@ControllerAdvice(basePackages = {"com.yang.controller"})
public class PageController {

    @ModelAttribute("timestamp")
    public Long timestampInit() {
        return System.currentTimeMillis();
    }

}
