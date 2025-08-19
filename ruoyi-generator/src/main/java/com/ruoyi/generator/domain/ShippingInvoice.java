package com.ruoyi.generator.domain;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * 生成订单流水号表
 * @author mzh
 */
public class ShippingInvoice implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 流水号 */
    @NotBlank(message = "流水号不能为空")
    private Long invoiceNo;

    /** 流水号类型 */
    @NotBlank(message = "流水号类型不能为空")
    private String invoiceType;

    /** 流水号操作时间 */
    private Date invoiceTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
    }
}