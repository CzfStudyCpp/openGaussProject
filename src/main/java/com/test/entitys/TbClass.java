package com.test.entitys;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
注意：下面的数据库字段和实体字段对应；
（1）如果，两个字段完全一样，则必须关闭application.yml中的map-underscore-to-camel-case属性；
    mybatis-plus:
        configuration:
            # 关闭数据库下划线自动转驼峰
            map-underscore-to-camel-case: false

（2）如果，数据库字段属性是下划线，实体字段是驼峰式，则必须开启application.yml中的map-underscore-to-camel-case属性（默认开启）
*/


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_class")
public class TbClass {
    @TableId("c_id")
    private String c_id;
    @TableField("c_name")
    private String c_name;
    @TableField("c_age")
    private String c_age;
}

