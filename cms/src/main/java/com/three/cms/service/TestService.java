package com.three.cms.service;

import com.three.cms.entity.Test;
import java.util.List;

public interface TestService {


    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertOrUpdate(Test record);

    int insertOrUpdateSelective(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

    int updateBatch(List<Test> list);

    int batchInsert(List<Test> list);

}

