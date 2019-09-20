package com.three.cms.mapper;

import com.three.cms.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertOrUpdate(Test record);

    int insertOrUpdateSelective(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

    int updateBatch(List<Test> list);

    int batchInsert(@Param("list") List<Test> list);
}