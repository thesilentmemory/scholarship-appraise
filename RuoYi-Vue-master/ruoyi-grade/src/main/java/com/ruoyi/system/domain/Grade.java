package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * grade对象 grade
 * 
 * @author liuzhihao
 * @date 2023-01-04
 */
public class Grade extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 学生学号 */
    @Excel(name = "学生学号")
    private Long stuid;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String 姓名;

    /** 学生科目 */
    @Excel(name = "学生科目")
    private String 科目;

    /** 学生成绩 */
    @Excel(name = "学生成绩")
    private String 成绩;

    /** 是否及格 */
    @Excel(name = "是否及格")
    private String 结果;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStuid(Long stuid) 
    {
        this.stuid = stuid;
    }

    public Long getStuid() 
    {
        return stuid;
    }
    public void set姓名(String 姓名) 
    {
        this.姓名 = 姓名;
    }

    public String get姓名() 
    {
        return 姓名;
    }
    public void set科目(String 科目) 
    {
        this.科目 = 科目;
    }

    public String get科目() 
    {
        return 科目;
    }
    public void set成绩(String 成绩) 
    {
        this.成绩 = 成绩;
    }

    public String get成绩() 
    {
        return 成绩;
    }
    public void set结果(String 结果) 
    {
        this.结果 = 结果;
    }

    public String get结果() 
    {
        return 结果;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuid", getStuid())
            .append("姓名", get姓名())
            .append("科目", get科目())
            .append("成绩", get成绩())
            .append("结果", get结果())
            .toString();
    }
}
