package com.ruoyi.upload.controller;

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
import com.ruoyi.upload.domain.ShippingUpload;
import com.ruoyi.upload.service.IShippingUploadService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 上传文件Controller
 * 
 * @author ruoyi
 * @date 2025-04-10
 */
@RestController
@RequestMapping("/upload/upload")
public class ShippingUploadController extends BaseController
{
    @Autowired
    private IShippingUploadService shippingUploadService;

    /**
     * 查询上传文件列表
     */
    @GetMapping("/list")
    public TableDataInfo list(ShippingUpload shippingUpload)
    {
        startPage();
        List<ShippingUpload> list = shippingUploadService.selectShippingUploadList(shippingUpload);
        return getDataTable(list);
    }

    /**
     * 导出上传文件列表
     */
    @Log(title = "上传文件", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShippingUpload shippingUpload)
    {
        List<ShippingUpload> list = shippingUploadService.selectShippingUploadList(shippingUpload);
        ExcelUtil<ShippingUpload> util = new ExcelUtil<ShippingUpload>(ShippingUpload.class);
        util.exportExcel(response, list, "上传文件数据");
    }

    /**
     * 获取上传文件详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(shippingUploadService.selectShippingUploadById(id));
    }

    /**
     * 新增上传文件
     */
    @Log(title = "上传文件", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShippingUpload shippingUpload)
    {
        return toAjax(shippingUploadService.insertShippingUpload(shippingUpload));
    }

    /**
     * 修改上传文件
     */
    @Log(title = "上传文件", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShippingUpload shippingUpload)
    {
        return toAjax(shippingUploadService.updateShippingUpload(shippingUpload));
    }

    /**
     * 删除上传文件
     */
    @Log(title = "上传文件", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(shippingUploadService.deleteShippingUploadByIds(ids));
    }
}
