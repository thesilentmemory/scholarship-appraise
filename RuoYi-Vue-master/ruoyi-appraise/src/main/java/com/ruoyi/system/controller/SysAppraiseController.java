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
import com.ruoyi.system.domain.SysAppraise;
import com.ruoyi.system.service.ISysAppraiseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * appraiseController
 * 
 * @author ruoyi
 * @date 2023-05-06
 */
@RestController
@RequestMapping("/system/appraise")
public class SysAppraiseController extends BaseController
{
    @Autowired
    private ISysAppraiseService sysAppraiseService;

    /**
     * 查询appraise列表
     */
    @PreAuthorize("@ss.hasPermi('system:appraise:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysAppraise sysAppraise)
    {
        startPage();
        List<SysAppraise> list = sysAppraiseService.selectSysAppraiseList(sysAppraise);
        return getDataTable(list);
    }

    /**
     * 导出appraise列表
     */
    @PreAuthorize("@ss.hasPermi('system:appraise:export')")
    @Log(title = "appraise", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysAppraise sysAppraise)
    {
        List<SysAppraise> list = sysAppraiseService.selectSysAppraiseList(sysAppraise);
        ExcelUtil<SysAppraise> util = new ExcelUtil<SysAppraise>(SysAppraise.class);
        util.exportExcel(response, list, "appraise数据");
    }

    /**
     * 获取appraise详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:appraise:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysAppraiseService.selectSysAppraiseById(id));
    }

    /**
     * 新增appraise
     */
    @PreAuthorize("@ss.hasPermi('system:appraise:add')")
    @Log(title = "appraise", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysAppraise sysAppraise)
    {
        return toAjax(sysAppraiseService.insertSysAppraise(sysAppraise));
    }

    /**
     * 修改appraise
     */
    @PreAuthorize("@ss.hasPermi('system:appraise:edit')")
    @Log(title = "appraise", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysAppraise sysAppraise)
    {
        return toAjax(sysAppraiseService.updateSysAppraise(sysAppraise));
    }

    /**
     * 删除appraise
     */
    @PreAuthorize("@ss.hasPermi('system:appraise:remove')")
    @Log(title = "appraise", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysAppraiseService.deleteSysAppraiseByIds(ids));
    }
}
