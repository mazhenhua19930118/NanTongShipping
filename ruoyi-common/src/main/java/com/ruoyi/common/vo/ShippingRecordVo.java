package com.ruoyi.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.math.BigDecimal;

/**
 * @author mzh
 */
public class ShippingRecordVo extends BaseEntity {
    /** 序号 */
    private Long id;
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

    /** 货源编号 */
    @Excel(name = "货源编号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long goodsId;

    private String status;

    @Excel(name = "状态")
    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}
