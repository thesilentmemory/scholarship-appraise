package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SrReview;
import com.ruoyi.system.service.ISrReviewService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 奖学金评审Controller
 * 
 * @author liuzhihao
 * @date 2023-01-04
 */
@RestController
@RequestMapping("/system/review")
public class SrReviewController extends BaseController
{
    @Autowired
    private ISrReviewService srReviewService;

    /**
     * 查询奖学金评审列表
     */
    @PreAuthorize("@ss.hasPermi('system:review:list')")
    @GetMapping("/list")
    public TableDataInfo list(SrReview srReview)
    {
        startPage();
        List<SrReview> list = srReviewService.selectSrReviewList(srReview);
        return getDataTable(list);
    }

    /**
     * 导出奖学金评审列表
     */
    @PreAuthorize("@ss.hasPermi('system:review:export')")
    @Log(title = "奖学金评审", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SrReview srReview)
    {
        List<SrReview> list = srReviewService.selectSrReviewList(srReview);
        ExcelUtil<SrReview> util = new ExcelUtil<SrReview>(SrReview.class);
        util.exportExcel(response, list, "奖学金评审数据");
    }

    /**
     * 获取奖学金评审详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:review:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(srReviewService.selectSrReviewById(id));
    }

    /**
     * 新增奖学金评审
     */
    @PreAuthorize("@ss.hasPermi('system:review:add')")
    @Log(title = "奖学金评审", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SrReview srReview)
    {
        return toAjax(srReviewService.insertSrReview(srReview));
    }

    /**
     * 修改奖学金评审
     */
    @PreAuthorize("@ss.hasPermi('system:review:edit')")
    @Log(title = "奖学金评审", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SrReview srReview)
    {
        return toAjax(srReviewService.updateSrReview(srReview));
    }

    /**
     * 删除奖学金评审
     */
    @PreAuthorize("@ss.hasPermi('system:review:remove')")
    @Log(title = "奖学金评审", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(srReviewService.deleteSrReviewByIds(ids));
    }
}
