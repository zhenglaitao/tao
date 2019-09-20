package com.three.cms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.three.cms.entity.Test;
import java.util.List;
import com.three.cms.mapper.TestMapper;
import com.three.cms.service.TestService;
@Service
public class TestServiceImpl implements TestService{

    @Resource
    private TestMapper testMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return testMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Test record) {
        return testMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Test record) {
        return testMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Test record) {
        return testMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Test record) {
        return testMapper.insertSelective(record);
    }

    @Override
    public Test selectByPrimaryKey(Integer id) {
        return testMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Test record) {
        return testMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Test record) {
        return testMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Test> list) {
        return testMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Test> list) {
        return testMapper.batchInsert(list);
    }

}
