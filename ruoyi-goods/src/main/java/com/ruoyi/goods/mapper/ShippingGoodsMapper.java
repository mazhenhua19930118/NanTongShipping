package com.ruoyi.goods.mapper;

import java.util.List;
import com.ruoyi.goods.domain.ShippingGoods;

/**
 * 货源信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-08-19
 */
public interface ShippingGoodsMapper 
{
    /**
     * 查询货源信息
     * 
     * @param id 货源信息主键
     * @return 货源信息
     */
    public ShippingGoods selectShippingGoodsById(Long id);

    /**
     * 查询货源信息列表
     * 
     * @param shippingGoods 货源信息
     * @return 货源信息集合
     */
    public List<ShippingGoods> selectShippingGoodsList(ShippingGoods shippingGoods);

    /**
     * 新增货源信息
     * 
     * @param shippingGoods 货源信息
     * @return 结果
     */
    public int insertShippingGoods(ShippingGoods shippingGoods);

    /**
     * 修改货源信息
     * 
     * @param shippingGoods 货源信息
     * @return 结果
     */
    public int updateShippingGoods(ShippingGoods shippingGoods);

    /**
     * 删除货源信息
     * 
     * @param id 货源信息主键
     * @return 结果
     */
    public int deleteShippingGoodsById(Long id);

    /**
     * 批量删除货源信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShippingGoodsByIds(Long[] ids);
}
