package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GradeMapper;
import com.ruoyi.system.domain.Grade;
import com.ruoyi.system.service.IGradeService;

/**
 * gradeService业务层处理
 * 
 * @author liuzhihao
 * @date 2023-01-04
 */
@Service
public class GradeServiceImpl implements IGradeService 
{
    @Autowired
    private GradeMapper gradeMapper;

    /**
     * 查询grade
     * 
     * @param id grade主键
     * @return grade
     */
    @Override
    public Grade selectGradeById(Long id)
    {
        return gradeMapper.selectGradeById(id);
    }

    /**
     * 查询grade列表
     * 
     * @param grade grade
     * @return grade
     */
    @Override
    public List<Grade> selectGradeList(Grade grade)
    {
        return gradeMapper.selectGradeList(grade);
    }

    /**
     * 新增grade
     * 
     * @param grade grade
     * @return 结果
     */
    @Override
    public int insertGrade(Grade grade)
    {
        return gradeMapper.insertGrade(grade);
    }

    /**
     * 修改grade
     * 
     * @param grade grade
     * @return 结果
     */
    @Override
    public int updateGrade(Grade grade)
    {
        return gradeMapper.updateGrade(grade);
    }

    /**
     * 批量删除grade
     * 
     * @param ids 需要删除的grade主键
     * @return 结果
     */
    @Override
    public int deleteGradeByIds(Long[] ids)
    {
        return gradeMapper.deleteGradeByIds(ids);
    }

    /**
     * 删除grade信息
     * 
     * @param id grade主键
     * @return 结果
     */
    @Override
    public int deleteGradeById(Long id)
    {
        return gradeMapper.deleteGradeById(id);
    }
}
