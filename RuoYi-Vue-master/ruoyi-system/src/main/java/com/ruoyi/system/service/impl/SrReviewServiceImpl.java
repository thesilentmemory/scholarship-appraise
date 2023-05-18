package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SrReviewMapper;
import com.ruoyi.system.domain.SrReview;
import com.ruoyi.system.service.ISrReviewService;

/**
 * 奖学金评审Service业务层处理
 * 
 * @author liuzhihao
 * @date 2023-01-04
 */
@Service
public class SrReviewServiceImpl implements ISrReviewService 
{
    @Autowired
    private SrReviewMapper srReviewMapper;

    /**
     * 查询奖学金评审
     * 
     * @param id 奖学金评审主键
     * @return 奖学金评审
     */
    @Override
    public SrReview selectSrReviewById(Long id)
    {
        return srReviewMapper.selectSrReviewById(id);
    }

    /**
     * 查询奖学金评审列表
     * 
     * @param srReview 奖学金评审
     * @return 奖学金评审
     */
    @Override
    public List<SrReview> selectSrReviewList(SrReview srReview)
    {
        return srReviewMapper.selectSrReviewList(srReview);
    }

    /**
     * 新增奖学金评审
     * 
     * @param srReview 奖学金评审
     * @return 结果
     */
    @Override
    public int insertSrReview(SrReview srReview)
    {
        return srReviewMapper.insertSrReview(srReview);
    }

    /**
     * 修改奖学金评审
     * 
     * @param srReview 奖学金评审
     * @return 结果
     */
    @Override
    public int updateSrReview(SrReview srReview)
    {
        return srReviewMapper.updateSrReview(srReview);
    }

    /**
     * 批量删除奖学金评审
     * 
     * @param ids 需要删除的奖学金评审主键
     * @return 结果
     */
    @Override
    public int deleteSrReviewByIds(Long[] ids)
    {
        return srReviewMapper.deleteSrReviewByIds(ids);
    }

    /**
     * 删除奖学金评审信息
     * 
     * @param id 奖学金评审主键
     * @return 结果
     */
    @Override
    public int deleteSrReviewById(Long id)
    {
        return srReviewMapper.deleteSrReviewById(id);
    }
}
