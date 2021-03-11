package com.lutong.tacocloud;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 路瞳
 * @Data
 */
@ComponentScan
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
//返回视图名
        return "home";
    }
}