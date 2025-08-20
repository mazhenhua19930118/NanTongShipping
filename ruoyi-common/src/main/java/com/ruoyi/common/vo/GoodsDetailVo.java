package com.ruoyi.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author mzh
 */
public class GoodsDetailVo extends BaseEntity {
    /** 托运单位 */
    @Excel(name = "托运单位")
    private String shippingUnit;

    /** 海伦号 */
    @Excel(name = "海伦号")
    private String helenNumber;

    /** 船号 */
    @Excel(name = "船号")
    private String shipNumber;

    /** 中转港 */
    @Excel(name = "中转港")
    private String transitPort;

    /** 目的港 */
    @Excel(name = "目的港")
    private String destinationPort;

    /** 重量 */
    @Excel(name = "重量")
    private BigDecimal weight;

    /** 1吨 2千克 3克 */
    private String weightUnit;

    /** 1吨 2千克 3克 */
    @Excel(name = "重量单位")
    private String weightUnitName;

    /** 货物 */
    @Excel(name = "货物")
    private String goods;

    /** 状态 */
    private String status;

    @Excel(name = "状态")
    private String statusName;

    /** 创建者 */
    @Excel(name = "创建者")
    private String createByExcel;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private String createTimeExcel;

    /** 发布者 */
    @Excel(name = "发布者")
    private String publishBy;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date publishTime;

    @Excel(name = "发布时间")
    private String publishTimeExcel;

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

    /** 货源编号 */
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

    /** 保险状态 0待预保险 1预保险 2已确认保险 */
    @Excel(name = "保险状态 0预保险 1已确认保险")
    private String insuranceStatus;

    /** 是否预付款 0否 1是 */
    @Excel(name = "是否预付款 0否 1是")
    private String isAdvancePayment;

    /** 子订单价格 */
    @Excel(name = "子订单价格")
    private BigDecimal subOrderPrice;

    /** 主订单价格 */
    @Excel(name = "主订单价格")
    private BigDecimal mainOrderPrice;

    /** 超耗重量 */
    @Excel(name = "超耗重量")
    private BigDecimal aboveLimitWeight;

    /** 超耗重量单位 */
    @Excel(name = "超耗重量单位")
    private String aboveLimitWeightUnit;

    /** 货物价格 */
    @Excel(name = "货物价格")
    private BigDecimal goodsPrice;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private BigDecimal paymentAmount;

    /** 结算金额 */
    @Excel(name = "结算金额")
    private BigDecimal settlementAmount;

    /** 延期费支付金额 */
    @Excel(name = "延期费支付金额")
    private BigDecimal deferredPayment;

    /** 延期费结算金额 */
    @Excel(name = "延期费结算金额")
    private BigDecimal deferredSettlement;

    /** 是否上传卸货明细 0否 1是 */
    @Excel(name = "是否上传卸货明细 0否 1是")
    private String isUpLoadDetailsManagement;

    @Excel(name = "耗时")
    private String timeConsuming;

    @Excel(name = "负责人名字")
    private String directorName;

    @Excel(name = "负责人id")
    private Long director;

    /**
     *  装货图片
     */
    private List<ShippingUploadVo> loadingImages;

    /**
     *  卸货货图片
     */
    private List<ShippingUploadVo> unloadedImages;

    public List<ShippingUploadVo> getLoadingImages() {
        return loadingImages;
    }

    public void setLoadingImages(List<ShippingUploadVo> loadingImages) {
        this.loadingImages = loadingImages;
    }

    public List<ShippingUploadVo> getUnloadedImages() {
        return unloadedImages;
    }

    public void setUnloadedImages(List<ShippingUploadVo> unloadedImages) {
        this.unloadedImages = unloadedImages;
    }

    public Long getDirector() {
        return director;
    }

    public void setDirector(Long director) {
        this.director = director;
    }

    public String getShippingUnit() {
        return shippingUnit;
    }

    public void setShippingUnit(String shippingUnit) {
        this.shippingUnit = shippingUnit;
    }

    public String getHelenNumber() {
        return helenNumber;
    }

    public void setHelenNumber(String helenNumber) {
        this.helenNumber = helenNumber;
    }

    public String getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(String shipNumber) {
        this.shipNumber = shipNumber;
    }

    public String getTransitPort() {
        return transitPort;
    }

    public void setTransitPort(String transitPort) {
        this.transitPort = transitPort;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getWeightUnitName() {
        return weightUnitName;
    }

    public void setWeightUnitName(String weightUnitName) {
        this.weightUnitName = weightUnitName;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getCreateByExcel() {
        return createByExcel;
    }

    public void setCreateByExcel(String createByExcel) {
        this.createByExcel = createByExcel;
    }

    public String getCreateTimeExcel() {
        return createTimeExcel;
    }

    public void setCreateTimeExcel(String createTimeExcel) {
        this.createTimeExcel = createTimeExcel;
    }

    public String getPublishBy() {
        return publishBy;
    }

    public void setPublishBy(String publishBy) {
        this.publishBy = publishBy;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getPublishTimeExcel() {
        return publishTimeExcel;
    }

    public void setPublishTimeExcel(String publishTimeExcel) {
        this.publishTimeExcel = publishTimeExcel;
    }

    public String getMainContractNo() {
        return mainContractNo;
    }

    public void setMainContractNo(String mainContractNo) {
        this.mainContractNo = mainContractNo;
    }

    public String getMainContractName() {
        return mainContractName;
    }

    public void setMainContractName(String mainContractName) {
        this.mainContractName = mainContractName;
    }

    public String getSubContractNo() {
        return subContractNo;
    }

    public void setSubContractNo(String subContractNo) {
        this.subContractNo = subContractNo;
    }

    public String getSubContractName() {
        return subContractName;
    }

    public void setSubContractName(String subContractName) {
        this.subContractName = subContractName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMainContractSign() {
        return mainContractSign;
    }

    public void setMainContractSign(String mainContractSign) {
        this.mainContractSign = mainContractSign;
    }

    public String getSubContractSign() {
        return subContractSign;
    }

    public void setSubContractSign(String subContractSign) {
        this.subContractSign = subContractSign;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getInsuranceStatus() {
        return insuranceStatus;
    }

    public void setInsuranceStatus(String insuranceStatus) {
        this.insuranceStatus = insuranceStatus;
    }

    public String getIsAdvancePayment() {
        return isAdvancePayment;
    }

    public void setIsAdvancePayment(String isAdvancePayment) {
        this.isAdvancePayment = isAdvancePayment;
    }

    public BigDecimal getSubOrderPrice() {
        return subOrderPrice;
    }

    public void setSubOrderPrice(BigDecimal subOrderPrice) {
        this.subOrderPrice = subOrderPrice;
    }

    public BigDecimal getMainOrderPrice() {
        return mainOrderPrice;
    }

    public void setMainOrderPrice(BigDecimal mainOrderPrice) {
        this.mainOrderPrice = mainOrderPrice;
    }

    public BigDecimal getAboveLimitWeight() {
        return aboveLimitWeight;
    }

    public void setAboveLimitWeight(BigDecimal aboveLimitWeight) {
        this.aboveLimitWeight = aboveLimitWeight;
    }

    public String getAboveLimitWeightUnit() {
        return aboveLimitWeightUnit;
    }

    public void setAboveLimitWeightUnit(String aboveLimitWeightUnit) {
        this.aboveLimitWeightUnit = aboveLimitWeightUnit;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public BigDecimal getDeferredPayment() {
        return deferredPayment;
    }

    public void setDeferredPayment(BigDecimal deferredPayment) {
        this.deferredPayment = deferredPayment;
    }

    public BigDecimal getDeferredSettlement() {
        return deferredSettlement;
    }

    public void setDeferredSettlement(BigDecimal deferredSettlement) {
        this.deferredSettlement = deferredSettlement;
    }

    public String getIsUpLoadDetailsManagement() {
        return isUpLoadDetailsManagement;
    }

    public void setIsUpLoadDetailsManagement(String isUpLoadDetailsManagement) {
        this.isUpLoadDetailsManagement = isUpLoadDetailsManagement;
    }

    public String getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(String timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}
