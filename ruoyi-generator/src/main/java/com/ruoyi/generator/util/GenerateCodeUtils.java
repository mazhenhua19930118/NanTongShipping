package com.ruoyi.generator.util;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtil;
import com.ruoyi.generator.domain.ShippingInvoice;
import com.ruoyi.generator.mapper.ShippingInvoiceMapper;
import org.apache.commons.lang3.StringUtils;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
public class GenerateCodeUtils {
    @Autowired
    private ShippingInvoiceMapper shippingInvoiceMapper;
    private static final String ORDER_NO_UNKNOW = "UNKNOW";
    @Resource
    private RedissonClient redissonClient;
    /**
     * 自定义生成订单号
     * 规则 XQ2025072200000001 自增
     */
    public String generateOrderCode(String invoiceType) {
        return getInvoiceNo(invoiceType);
    }

    @Transactional
    public String getInvoiceNo(String invoiceType) {
        //枷锁
        RLock lock = redissonClient.getLock("invoiceNoLock"); // 获取锁
        try {
            lock.lock();// 阻塞直到获取锁
            ShippingInvoice shippingInvoice = new ShippingInvoice();
            shippingInvoice.setInvoiceType(invoiceType);
            ShippingInvoice invoice = shippingInvoiceMapper.selectInvoice(shippingInvoice);
            String nowDate = DateUtils.dateTime();
            StringBuffer sb = new StringBuffer();
            sb.append(invoiceType);
            String invoiceTime = DateUtils.parseDateToStr("yyyyMMdd", invoice.getInvoiceTime());
            // 判断是否是同一天 不是重置序列号
            if (StringUtil.isEquals(nowDate, invoiceTime)) {
                shippingInvoiceMapper.updateInvoiceNo(invoice.getId());
                ShippingInvoice invoiceNew = shippingInvoiceMapper.selectInvoice(shippingInvoice);
                sb.append(invoiceTime);
                sb.append(StringUtils.leftPad(String.valueOf(invoiceNew.getInvoiceNo()), 8, '0'));
                return sb.toString();
            } else {
                //重置
                shippingInvoiceMapper.updateInvoice(invoice.getId());
                invoice.setInvoiceNo(1L);
                sb.append(DateUtils.dateTime());
                sb.append(StringUtils.leftPad(String.valueOf(invoice.getInvoiceNo()), 8, '0'));
            }
            return StringUtil.isNullOrEmpty(sb.toString()) ? ORDER_NO_UNKNOW : sb.toString();
        } finally {
            lock.unlock(); // 解锁
        }
    }
}
