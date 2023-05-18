package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SrReview;

/**
 * 奖学金评审Mapper接口
 * 
 * @author liuzhihao
 * @date 2023-01-04
 */
public interface SrReviewMapper 
{
    /**
     * 查询奖学金评审
     * 
     * @param id 奖学金评审主键
     * @return 奖学金评审
     */
    public SrReview selectSrReviewById(Long id);

    /**
     * 查询奖学金评审列表
     * 
     * @param srReview 奖学金评审
     * @return 奖学金评审集合
     */
    public List<SrReview> selectSrReviewList(SrReview srReview);

    /**
     * 新增奖学金评审
     * 
     * @param srReview 奖学金评审
     * @return 结果
     */
    public int insertSrReview(SrReview srReview);

    /**
     * 修改奖学金评审
     * 
     * @param srReview 奖学金评审
     * @return 结果
     */
    public int updateSrReview(SrReview srReview);

    /**
     * 删除奖学金评审
     * 
     * @param id 奖学金评审主键
     * @return 结果
     */
    public int deleteSrReviewById(Long id);

    /**
     * 批量删除奖学金评审
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSrReviewByIds(Long[] ids);
}
