package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysAppraise;

/**
 * appraiseMapper接口
 * 
 * @author ruoyi
 * @date 2023-05-06
 */
public interface SysAppraiseMapper 
{
    /**
     * 查询appraise
     * 
     * @param id appraise主键
     * @return appraise
     */
    public SysAppraise selectSysAppraiseById(Long id);

    /**
     * 查询appraise列表
     * 
     * @param sysAppraise appraise
     * @return appraise集合
     */
    public List<SysAppraise> selectSysAppraiseList(SysAppraise sysAppraise);

    /**
     * 新增appraise
     * 
     * @param sysAppraise appraise
     * @return 结果
     */
    public int insertSysAppraise(SysAppraise sysAppraise);

    /**
     * 修改appraise
     * 
     * @param sysAppraise appraise
     * @return 结果
     */
    public int updateSysAppraise(SysAppraise sysAppraise);

    /**
     * 删除appraise
     * 
     * @param id appraise主键
     * @return 结果
     */
    public int deleteSysAppraiseById(Long id);

    /**
     * 批量删除appraise
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysAppraiseByIds(Long[] ids);
}
