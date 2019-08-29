package com.three.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zlt
 */
@Controller
public class TestController {

    @GetMapping("/")
    public String testIndex(){
        return "index";
    }
}
