package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Grade;

/**
 * gradeMapper接口
 * 
 * @author liuzhihao
 * @date 2023-01-04
 */
public interface GradeMapper 
{
    /**
     * 查询grade
     * 
     * @param id grade主键
     * @return grade
     */
    public Grade selectGradeById(Long id);

    /**
     * 查询grade列表
     * 
     * @param grade grade
     * @return grade集合
     */
    public List<Grade> selectGradeList(Grade grade);

    /**
     * 新增grade
     * 
     * @param grade grade
     * @return 结果
     */
    public int insertGrade(Grade grade);

    /**
     * 修改grade
     * 
     * @param grade grade
     * @return 结果
     */
    public int updateGrade(Grade grade);

    /**
     * 删除grade
     * 
     * @param id grade主键
     * @return 结果
     */
    public int deleteGradeById(Long id);

    /**
     * 批量删除grade
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGradeByIds(Long[] ids);
}
