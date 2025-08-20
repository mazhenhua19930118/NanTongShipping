package com.ruoyi.insurance.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.insurance.mapper.ShippingInsuranceMapper;
import com.ruoyi.insurance.domain.ShippingInsurance;
import com.ruoyi.insurance.service.IShippingInsuranceService;

/**
 * 保险管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-08-20
 */
@Service
public class ShippingInsuranceServiceImpl implements IShippingInsuranceService 
{
    @Autowired
    private ShippingInsuranceMapper shippingInsuranceMapper;

    /**
     * 查询保险管理
     * 
     * @param id 保险管理主键
     * @return 保险管理
     */
    @Override
    public ShippingInsurance selectShippingInsuranceById(Long id)
    {
        return shippingInsuranceMapper.selectShippingInsuranceById(id);
    }

    /**
     * 查询保险管理列表
     * 
     * @param shippingInsurance 保险管理
     * @return 保险管理
     */
    @Override
    public List<ShippingInsurance> selectShippingInsuranceList(ShippingInsurance shippingInsurance)
    {
        return shippingInsuranceMapper.selectShippingInsuranceList(shippingInsurance);
    }

    /**
     * 新增保险管理
     * 
     * @param shippingInsurance 保险管理
     * @return 结果
     */
    @Override
    public int insertShippingInsurance(ShippingInsurance shippingInsurance)
    {
        shippingInsurance.setCreateTime(DateUtils.getNowDate());
        return shippingInsuranceMapper.insertShippingInsurance(shippingInsurance);
    }

    /**
     * 修改保险管理
     * 
     * @param shippingInsurance 保险管理
     * @return 结果
     */
    @Override
    public int updateShippingInsurance(ShippingInsurance shippingInsurance)
    {
        shippingInsurance.setUpdateTime(DateUtils.getNowDate());
        return shippingInsuranceMapper.updateShippingInsurance(shippingInsurance);
    }

    /**
     * 批量删除保险管理
     * 
     * @param ids 需要删除的保险管理主键
     * @return 结果
     */
    @Override
    public int deleteShippingInsuranceByIds(Long[] ids)
    {
        return shippingInsuranceMapper.deleteShippingInsuranceByIds(ids);
    }

    /**
     * 删除保险管理信息
     * 
     * @param id 保险管理主键
     * @return 结果
     */
    @Override
    public int deleteShippingInsuranceById(Long id)
    {
        return shippingInsuranceMapper.deleteShippingInsuranceById(id);
    }
}
