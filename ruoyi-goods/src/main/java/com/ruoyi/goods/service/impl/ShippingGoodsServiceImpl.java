package com.ruoyi.goods.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.goods.mapper.ShippingGoodsMapper;
import com.ruoyi.goods.domain.ShippingGoods;
import com.ruoyi.goods.service.IShippingGoodsService;

/**
 * 货源信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-08-19
 */
@Service
public class ShippingGoodsServiceImpl implements IShippingGoodsService 
{
    @Autowired
    private ShippingGoodsMapper shippingGoodsMapper;

    /**
     * 查询货源信息
     * 
     * @param id 货源信息主键
     * @return 货源信息
     */
    @Override
    public ShippingGoods selectShippingGoodsById(Long id)
    {
        return shippingGoodsMapper.selectShippingGoodsById(id);
    }

    /**
     * 查询货源信息列表
     * 
     * @param shippingGoods 货源信息
     * @return 货源信息
     */
    @Override
    public List<ShippingGoods> selectShippingGoodsList(ShippingGoods shippingGoods)
    {
        return shippingGoodsMapper.selectShippingGoodsList(shippingGoods);
    }

    /**
     * 新增货源信息
     * 
     * @param shippingGoods 货源信息
     * @return 结果
     */
    @Override
    public int insertShippingGoods(ShippingGoods shippingGoods)
    {
        shippingGoods.setCreateTime(DateUtils.getNowDate());
        return shippingGoodsMapper.insertShippingGoods(shippingGoods);
    }

    /**
     * 修改货源信息
     * 
     * @param shippingGoods 货源信息
     * @return 结果
     */
    @Override
    public int updateShippingGoods(ShippingGoods shippingGoods)
    {
        shippingGoods.setUpdateTime(DateUtils.getNowDate());
        return shippingGoodsMapper.updateShippingGoods(shippingGoods);
    }

    /**
     * 批量删除货源信息
     * 
     * @param ids 需要删除的货源信息主键
     * @return 结果
     */
    @Override
    public int deleteShippingGoodsByIds(Long[] ids)
    {
        return shippingGoodsMapper.deleteShippingGoodsByIds(ids);
    }

    /**
     * 删除货源信息信息
     * 
     * @param id 货源信息主键
     * @return 结果
     */
    @Override
    public int deleteShippingGoodsById(Long id)
    {
        return shippingGoodsMapper.deleteShippingGoodsById(id);
    }
}
