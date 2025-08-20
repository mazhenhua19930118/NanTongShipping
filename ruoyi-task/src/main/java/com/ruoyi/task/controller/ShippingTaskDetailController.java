package com.ruoyi.task.controller;

import com.alibaba.fastjson2.JSONObject;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.enums.FileType;
import com.ruoyi.common.enums.TaskStatus;
import com.ruoyi.common.utils.StringUtil;
import com.ruoyi.common.utils.file.FileUploadUtils;
import com.ruoyi.common.utils.file.MimeTypeUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.service.ISysUserService;
import com.ruoyi.task.domain.ShippingTask;
import com.ruoyi.task.domain.ShippingTaskDetail;
import com.ruoyi.task.service.IShippingTaskDetailService;
import com.ruoyi.task.service.IShippingTaskService;
import com.ruoyi.upload.domain.ShippingUpload;
import com.ruoyi.upload.service.IShippingUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller
 *
 * @author ruoyi
 * @date 2025-04-08
 */
@RestController
@RequestMapping("/documentation/taskDetail")
public class ShippingTaskDetailController extends BaseController {
    @Autowired
    private IShippingTaskDetailService shippingTaskDetailService;
    @Autowired
    private ISysUserService sysUserService;
    @Autowired
    private IShippingTaskService shippingTaskService;

    /**
     * 查询
     */
    @GetMapping("/list")
    public AjaxResult list(ShippingTaskDetail shippingTaskDetail) {
        return AjaxResult.success(shippingTaskDetailService.selectShippingTaskDetailList(shippingTaskDetail));
    }


    /**
     * 获取详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        ShippingTaskDetail task = shippingTaskDetailService.selectShippingTaskDetailById(id);
        return success(task);
    }


    /**
     * 获取详细信息
     */
    @GetMapping(value = "/detail")
    public AjaxResult getDetailInfo(ShippingTaskDetail shippingTaskDetail) {
        List<ShippingTaskDetail> shippingTaskDetailList = shippingTaskDetailService.selectShippingTaskDetailByTaskId(shippingTaskDetail.getTaskId());
        for (ShippingTaskDetail detail : shippingTaskDetailList) {
            SysUser director = sysUserService.selectUserById(detail.getDirector());
            SysUser sysUser = sysUserService.selectUserById(detail.getCreator());
            if (ObjectUtils.isEmpty(sysUser)) {
                detail.setUserName("未知用户");
            } else {
                detail.setUserName(sysUser.getUserName());
            }
            String desc = "";
            if (StringUtil.isEquals(TaskStatus.dispatch.getCode(), detail.getTaskStatus())) {
                desc = detail.getUserName() + TaskStatus.transferRemark(detail.getTaskStatus()) + "给" + (ObjectUtils.isEmpty(director) ? "未知用户" : director.getUserName());
            } else {
                desc = detail.getUserName() + TaskStatus.transferRemark(detail.getTaskStatus());
            }
            detail.setDesc(desc);
        }
        return success(shippingTaskDetailList);
    }

    /**
     * 校验本次流程前一次流程节点是否完成
     */
    @GetMapping(value = "/checkPreviousTaskNode")
    public AjaxResult checkPreviousTaskNode(ShippingTaskDetail shippingTaskDetail) {
        return shippingTaskDetailService.checkPreviousTaskNode(shippingTaskDetail);
    }

}
