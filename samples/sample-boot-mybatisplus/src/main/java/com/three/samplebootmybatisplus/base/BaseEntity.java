package com.three.samplebootmybatisplus.base;

import com.baomidou.mybatisplus.annotation.Version;

import java.util.Date;

public class BaseEntity {

    private Integer id;

    private Integer valid;

    private Date createTime;

    private Date updateTime;

    @Version
    private Integer version;
}
