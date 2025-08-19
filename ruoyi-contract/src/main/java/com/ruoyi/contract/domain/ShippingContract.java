package com.ruoyi.contract.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 合同管理对象 shipping_contract
 * 
 * @author ruoyi
 * @date 2025-08-19
 */
public class ShippingContract extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 主合同编号 */
    @Excel(name = "主合同编号")
    private String mainContractNo;

    /** 主合同名称 */
    @Excel(name = "主合同名称")
    private String mainContractName;

    /** 子合同编号 */
    @Excel(name = "子合同编号")
    private String subContractNo;

    /** 子合同名称 */
    @Excel(name = "子合同名称")
    private String subContractName;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderId;

    /** 主合同是否签订 1签订 0未签订 */
    @Excel(name = "主合同是否签订 1签订 0未签订")
    private String mainContractSign;

    /** 子合同是否签订 1签订 0未签订 */
    @Excel(name = "子合同是否签订 1签订 0未签订")
    private String subContractSign;

    /** 客户号 */
    @Excel(name = "客户号")
    private String customerNo;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String customerName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setMainContractNo(String mainContractNo) 
    {
        this.mainContractNo = mainContractNo;
    }

    public String getMainContractNo() 
    {
        return mainContractNo;
    }

    public void setMainContractName(String mainContractName) 
    {
        this.mainContractName = mainContractName;
    }

    public String getMainContractName() 
    {
        return mainContractName;
    }

    public void setSubContractNo(String subContractNo) 
    {
        this.subContractNo = subContractNo;
    }

    public String getSubContractNo() 
    {
        return subContractNo;
    }

    public void setSubContractName(String subContractName) 
    {
        this.subContractName = subContractName;
    }

    public String getSubContractName() 
    {
        return subContractName;
    }

    public void setOrderId(String orderId) 
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
    }

    public void setMainContractSign(String mainContractSign) 
    {
        this.mainContractSign = mainContractSign;
    }

    public String getMainContractSign() 
    {
        return mainContractSign;
    }

    public void setSubContractSign(String subContractSign) 
    {
        this.subContractSign = subContractSign;
    }

    public String getSubContractSign() 
    {
        return subContractSign;
    }

    public void setCustomerNo(String customerNo) 
    {
        this.customerNo = customerNo;
    }

    public String getCustomerNo() 
    {
        return customerNo;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }

    public String getCustomerName() 
    {
        return customerName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("mainContractNo", getMainContractNo())
            .append("mainContractName", getMainContractName())
            .append("subContractNo", getSubContractNo())
            .append("subContractName", getSubContractName())
            .append("orderId", getOrderId())
            .append("mainContractSign", getMainContractSign())
            .append("subContractSign", getSubContractSign())
            .append("customerNo", getCustomerNo())
            .append("customerName", getCustomerName())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
