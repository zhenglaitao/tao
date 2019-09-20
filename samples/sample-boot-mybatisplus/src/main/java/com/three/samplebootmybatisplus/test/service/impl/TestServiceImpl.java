package com.three.samplebootmybatisplus.test.service.impl;

import com.three.samplebootmybatisplus.test.entity.Test;
import com.three.samplebootmybatisplus.test.mapper.TestMapper;
import com.three.samplebootmybatisplus.test.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zlt
 * @since 2019-09-20
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
