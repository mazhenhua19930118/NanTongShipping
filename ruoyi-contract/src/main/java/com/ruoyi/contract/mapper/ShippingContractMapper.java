package com.ruoyi.contract.mapper;

import java.util.List;
import com.ruoyi.contract.domain.ShippingContract;

/**
 * 合同管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-08-19
 */
public interface ShippingContractMapper 
{
    /**
     * 查询合同管理
     * 
     * @param id 合同管理主键
     * @return 合同管理
     */
    public ShippingContract selectShippingContractById(Long id);

    /**
     * 查询合同管理列表
     * 
     * @param shippingContract 合同管理
     * @return 合同管理集合
     */
    public List<ShippingContract> selectShippingContractList(ShippingContract shippingContract);

    /**
     * 新增合同管理
     * 
     * @param shippingContract 合同管理
     * @return 结果
     */
    public int insertShippingContract(ShippingContract shippingContract);

    /**
     * 修改合同管理
     * 
     * @param shippingContract 合同管理
     * @return 结果
     */
    public int updateShippingContract(ShippingContract shippingContract);

    /**
     * 删除合同管理
     * 
     * @param id 合同管理主键
     * @return 结果
     */
    public int deleteShippingContractById(Long id);

    /**
     * 批量删除合同管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShippingContractByIds(Long[] ids);
}
