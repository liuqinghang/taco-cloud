package com.lutong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 路瞳
 * @Data
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {

        return "home";
    }
}