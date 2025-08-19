package com.ruoyi.generator.mapper;


import com.ruoyi.generator.domain.ShippingInvoice;


/**
 * 生成自定义订单号
 * 
 * @author mzh
 */
public interface ShippingInvoiceMapper
{
    ShippingInvoice selectInvoice(ShippingInvoice shippingInvoice);

    void updateInvoice(Long id);

    void updateInvoiceNo(Long id);
}
