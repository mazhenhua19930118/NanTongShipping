package com.ruoyi.insurance.mapper;

import java.util.List;
import com.ruoyi.insurance.domain.ShippingInsurance;

/**
 * 保险管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-08-20
 */
public interface ShippingInsuranceMapper 
{
    /**
     * 查询保险管理
     * 
     * @param id 保险管理主键
     * @return 保险管理
     */
    public ShippingInsurance selectShippingInsuranceById(Long id);

    /**
     * 查询保险管理列表
     * 
     * @param shippingInsurance 保险管理
     * @return 保险管理集合
     */
    public List<ShippingInsurance> selectShippingInsuranceList(ShippingInsurance shippingInsurance);

    /**
     * 新增保险管理
     * 
     * @param shippingInsurance 保险管理
     * @return 结果
     */
    public int insertShippingInsurance(ShippingInsurance shippingInsurance);

    /**
     * 修改保险管理
     * 
     * @param shippingInsurance 保险管理
     * @return 结果
     */
    public int updateShippingInsurance(ShippingInsurance shippingInsurance);

    /**
     * 删除保险管理
     * 
     * @param id 保险管理主键
     * @return 结果
     */
    public int deleteShippingInsuranceById(Long id);

    /**
     * 批量删除保险管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShippingInsuranceByIds(Long[] ids);
}
