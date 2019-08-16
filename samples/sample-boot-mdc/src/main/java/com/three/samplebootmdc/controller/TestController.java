package com.three.samplebootmdc.controller;

import com.three.samplebootmdc.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public String test(){
        log.info("info test");
        log.warn("warn test");
        log.debug("debug test");
        log.error("error test");

        return "ok";
    }

    @GetMapping("/async")
    public void testAsync(){
        log.info("test async-----start");
        testService.asyncMethod1();
        testService.asyncMethod2();
        testService.asyncMethod3();
        log.info("test async-----end");
    }
}
