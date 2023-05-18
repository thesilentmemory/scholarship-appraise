package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAppraiseMapper;
import com.ruoyi.system.domain.SysAppraise;
import com.ruoyi.system.service.ISysAppraiseService;

/**
 * appraiseService业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-06
 */
@Service
public class SysAppraiseServiceImpl implements ISysAppraiseService 
{
    @Autowired
    private SysAppraiseMapper sysAppraiseMapper;

    /**
     * 查询appraise
     * 
     * @param id appraise主键
     * @return appraise
     */
    @Override
    public SysAppraise selectSysAppraiseById(Long id)
    {
        return sysAppraiseMapper.selectSysAppraiseById(id);
    }

    /**
     * 查询appraise列表
     * 
     * @param sysAppraise appraise
     * @return appraise
     */
    @Override
    public List<SysAppraise> selectSysAppraiseList(SysAppraise sysAppraise)
    {
        return sysAppraiseMapper.selectSysAppraiseList(sysAppraise);
    }

    /**
     * 新增appraise
     * 
     * @param sysAppraise appraise
     * @return 结果
     */
    @Override
    public int insertSysAppraise(SysAppraise sysAppraise)
    {
        return sysAppraiseMapper.insertSysAppraise(sysAppraise);
    }

    /**
     * 修改appraise
     * 
     * @param sysAppraise appraise
     * @return 结果
     */
    @Override
    public int updateSysAppraise(SysAppraise sysAppraise)
    {
        return sysAppraiseMapper.updateSysAppraise(sysAppraise);
    }

    /**
     * 批量删除appraise
     * 
     * @param ids 需要删除的appraise主键
     * @return 结果
     */
    @Override
    public int deleteSysAppraiseByIds(Long[] ids)
    {
        return sysAppraiseMapper.deleteSysAppraiseByIds(ids);
    }

    /**
     * 删除appraise信息
     * 
     * @param id appraise主键
     * @return 结果
     */
    @Override
    public int deleteSysAppraiseById(Long id)
    {
        return sysAppraiseMapper.deleteSysAppraiseById(id);
    }
}
