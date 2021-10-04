package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生基本信息对象 student
 * 
 * @author chenkaiyu
 * @date 2021-09-28
 */
public class Student extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学生id */
    private Long id;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String name;

    /** 学生年龄 */
    @Excel(name = "学生年龄")
    private Long age;

    /** 学生性别 */
    @Excel(name = "学生性别")
    private String sex;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("age", getAge())
            .append("sex", getSex())
            .toString();
    }
}
