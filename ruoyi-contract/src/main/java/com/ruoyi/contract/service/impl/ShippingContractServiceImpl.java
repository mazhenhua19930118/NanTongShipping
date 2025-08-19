package com.ruoyi.contract.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.contract.mapper.ShippingContractMapper;
import com.ruoyi.contract.domain.ShippingContract;
import com.ruoyi.contract.service.IShippingContractService;

/**
 * 合同管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-08-19
 */
@Service
public class ShippingContractServiceImpl implements IShippingContractService 
{
    @Autowired
    private ShippingContractMapper shippingContractMapper;

    /**
     * 查询合同管理
     * 
     * @param id 合同管理主键
     * @return 合同管理
     */
    @Override
    public ShippingContract selectShippingContractById(Long id)
    {
        return shippingContractMapper.selectShippingContractById(id);
    }

    /**
     * 查询合同管理列表
     * 
     * @param shippingContract 合同管理
     * @return 合同管理
     */
    @Override
    public List<ShippingContract> selectShippingContractList(ShippingContract shippingContract)
    {
        return shippingContractMapper.selectShippingContractList(shippingContract);
    }

    /**
     * 新增合同管理
     * 
     * @param shippingContract 合同管理
     * @return 结果
     */
    @Override
    public int insertShippingContract(ShippingContract shippingContract)
    {
        shippingContract.setCreateTime(DateUtils.getNowDate());
        return shippingContractMapper.insertShippingContract(shippingContract);
    }

    /**
     * 修改合同管理
     * 
     * @param shippingContract 合同管理
     * @return 结果
     */
    @Override
    public int updateShippingContract(ShippingContract shippingContract)
    {
        shippingContract.setUpdateTime(DateUtils.getNowDate());
        return shippingContractMapper.updateShippingContract(shippingContract);
    }

    /**
     * 批量删除合同管理
     * 
     * @param ids 需要删除的合同管理主键
     * @return 结果
     */
    @Override
    public int deleteShippingContractByIds(Long[] ids)
    {
        return shippingContractMapper.deleteShippingContractByIds(ids);
    }

    /**
     * 删除合同管理信息
     * 
     * @param id 合同管理主键
     * @return 结果
     */
    @Override
    public int deleteShippingContractById(Long id)
    {
        return shippingContractMapper.deleteShippingContractById(id);
    }
}
