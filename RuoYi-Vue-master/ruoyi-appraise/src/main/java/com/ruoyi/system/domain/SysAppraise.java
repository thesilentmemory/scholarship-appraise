package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * appraise对象 sys_appraise
 * 
 * @author ruoyi
 * @date 2023-05-06
 */
public class SysAppraise extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 学生学号 */
    @Excel(name = "学生学号")
    private Long stuid;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String name;

    /** 学生班级 */
    @Excel(name = "学生班级")
    private String classroom;

    /** 申请种类 */
    @Excel(name = "申请种类")
    private String applicationType;

    /** 证书 */
    @Excel(name = "证书")
    private String certificate;

    /** 申请表格 */
    @Excel(name = "申请表格")
    private String applicationForm;

    /** 申请日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 评审结果 */
    @Excel(name = "评审结果")
    private String review;

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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setClassroom(String classroom) 
    {
        this.classroom = classroom;
    }

    public String getClassroom() 
    {
        return classroom;
    }
    public void setApplicationType(String applicationType) 
    {
        this.applicationType = applicationType;
    }

    public String getApplicationType() 
    {
        return applicationType;
    }
    public void setCertificate(String certificate) 
    {
        this.certificate = certificate;
    }

    public String getCertificate() 
    {
        return certificate;
    }
    public void setApplicationForm(String applicationForm) 
    {
        this.applicationForm = applicationForm;
    }

    public String getApplicationForm() 
    {
        return applicationForm;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setReview(String review) 
    {
        this.review = review;
    }

    public String getReview() 
    {
        return review;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stuid", getStuid())
            .append("name", getName())
            .append("classroom", getClassroom())
            .append("applicationType", getApplicationType())
            .append("certificate", getCertificate())
            .append("applicationForm", getApplicationForm())
            .append("date", getDate())
            .append("review", getReview())
            .toString();
    }
}
