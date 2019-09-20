package com.three.samplebootmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.three.samplebootmybatisplus.*.mapper")
public class SampleBootMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleBootMybatisplusApplication.class, args);
    }

}
