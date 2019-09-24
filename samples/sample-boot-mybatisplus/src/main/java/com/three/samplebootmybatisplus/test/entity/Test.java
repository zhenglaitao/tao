package com.three.samplebootmybatisplus.test.entity;

import com.three.samplebootmybatisplus.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zlt
 * @since 2019-09-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Test extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("version")
    @Version
    private Integer version;


}
