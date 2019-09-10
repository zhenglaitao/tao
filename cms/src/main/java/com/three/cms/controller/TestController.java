package com.three.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zlt
 */
@Controller
public class TestController {

    @GetMapping("/")
    public String testIndex(){
        return "index";
    }

    @GetMapping("/testBeetl")
    public String testBeetl(HttpServletRequest request){
        request.setAttribute("aaa","diyici");
        return "test.html";
    }
}
