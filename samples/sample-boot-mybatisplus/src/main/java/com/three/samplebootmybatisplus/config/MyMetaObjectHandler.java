package com.three.samplebootmybatisplus.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {

        //是否存在set方法
        boolean bol =   metaObject.hasSetter("createTime");
        //createTime
        Object createdTime = getFieldValByName("createTime", metaObject);
        if(bol){
            //有set方法
            if (createdTime == null) {
                //值为null填充
                setFieldValByName("createTime", new Date(), metaObject);
            }
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //是否存在set方法
        boolean bol =   metaObject.hasSetter("updateTime");
        //拿到updateTime的值
        Object updateTime = getFieldValByName("updateTime", metaObject);
        if (bol){
            //有set方法
            if (updateTime == null) {
                //值为null填充
                setFieldValByName("updateTime", new Date(), metaObject);
            }
        }
    }
}
