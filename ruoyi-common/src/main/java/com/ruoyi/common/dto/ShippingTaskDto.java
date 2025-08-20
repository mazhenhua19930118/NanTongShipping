package com.ruoyi.common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ShippingTaskDto extends BaseEntity {
    /** id */
    private Long id;

    /** 货源编号 */
    @Excel(name = "订单编号")
    private String orderId;

    /** 1001 创建 1002 发布 1003 派单 */
    @Excel(name = "1001 创建 1002 发布 1003 派单")
    private String taskStatus;

    /** 分配人员id */
    @Excel(name = "分配人员id")
    private Long assignUserId;

    /** 分配人员姓名 */
    private String assignUserName;

    /** 分配人员昵称 */
    private String assignUserNickName;

    public String getAssignUserName() {
        return assignUserName;
    }

    public void setAssignUserName(String assignUserName) {
        this.assignUserName = assignUserName;
    }

    public String getAssignUserNickName() {
        return assignUserNickName;
    }

    public void setAssignUserNickName(String assignUserNickName) {
        this.assignUserNickName = assignUserNickName;
    }


    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void setAssignUserId(Long assignUserId)
    {
        this.assignUserId = assignUserId;
    }

    public Long getAssignUserId()
    {
        return assignUserId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("orderId", getOrderId())
                .append("taskStatus", getTaskStatus())
                .append("assignUserId", getAssignUserId())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
