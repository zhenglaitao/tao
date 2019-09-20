package com.three.samplebootmybatisplus.test.controller;


import com.three.samplebootmybatisplus.test.entity.Test;
import com.three.samplebootmybatisplus.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zlt
 * @since 2019-09-20
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping
    public List<Test> test(){
        Test test = new Test();
        test.setName(UUID.randomUUID().toString());
        testService.save(test);
        List<Test> list = testService.list();
        return list;
    }
}

