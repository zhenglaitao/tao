package com.three.samplebootmybatisplus.base;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("valid")
    @TableLogic
    private Integer valid;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;

}
