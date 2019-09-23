package com.three.samplebootmybatisplus.test.controller;


import com.three.samplebootmybatisplus.test.entity.Test;
import com.three.samplebootmybatisplus.test.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
 * @since 2019-09-23
 */
@RestController
@RequestMapping("/test")
public class TestController {



    @Autowired
    private ITestService testService;

    @GetMapping("/insert")
    public Integer testInsert(){
        Test test = new Test();
        test.setName(UUID.randomUUID().toString());
        test.setAge(11);
        boolean result = testService.save(test);
        return test.getId();
    }

    @GetMapping("/delete/{id}")
    public boolean testDelete(@PathVariable Integer id){
        boolean result = testService.removeById(id);
        return result;
    }

    @GetMapping("/update/{id}")
    public boolean testUpdate(@PathVariable Integer id){
        Test test = testService.getById(id);
        test.setName("aaa");
        boolean result = testService.updateById(test);
        return result;
    }

    @GetMapping("/list")
    public List<Test> testList(){
        return testService.list();
    }
}

