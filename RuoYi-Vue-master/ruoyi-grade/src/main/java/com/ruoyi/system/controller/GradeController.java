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
import com.ruoyi.system.domain.Grade;
import com.ruoyi.system.service.IGradeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * gradeController
 * 
 * @author liuzhihao
 * @date 2023-01-04
 */
@RestController
@RequestMapping("/system/grade")
public class GradeController extends BaseController
{
    @Autowired
    private IGradeService gradeService;

    /**
     * 查询grade列表
     */
    @PreAuthorize("@ss.hasPermi('system:grade:list')")
    @GetMapping("/list")
    public TableDataInfo list(Grade grade)
    {
        startPage();
        List<Grade> list = gradeService.selectGradeList(grade);
        return getDataTable(list);
    }

    /**
     * 导出grade列表
     */
    @PreAuthorize("@ss.hasPermi('system:grade:export')")
    @Log(title = "grade", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Grade grade)
    {
        List<Grade> list = gradeService.selectGradeList(grade);
        ExcelUtil<Grade> util = new ExcelUtil<Grade>(Grade.class);
        util.exportExcel(response, list, "grade数据");
    }

    /**
     * 获取grade详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:grade:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(gradeService.selectGradeById(id));
    }

    /**
     * 新增grade
     */
    @PreAuthorize("@ss.hasPermi('system:grade:add')")
    @Log(title = "grade", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Grade grade)
    {
        return toAjax(gradeService.insertGrade(grade));
    }

    /**
     * 修改grade
     */
    @PreAuthorize("@ss.hasPermi('system:grade:edit')")
    @Log(title = "grade", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Grade grade)
    {
        return toAjax(gradeService.updateGrade(grade));
    }

    /**
     * 删除grade
     */
    @PreAuthorize("@ss.hasPermi('system:grade:remove')")
    @Log(title = "grade", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(gradeService.deleteGradeByIds(ids));
    }
}
