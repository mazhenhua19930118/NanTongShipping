package com.ruoyi.upload.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.upload.mapper.ShippingUploadMapper;
import com.ruoyi.upload.domain.ShippingUpload;
import com.ruoyi.upload.service.IShippingUploadService;

/**
 * 上传文件Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-04-10
 */
@Service
public class ShippingUploadServiceImpl implements IShippingUploadService 
{
    @Autowired
    private ShippingUploadMapper shippingUploadMapper;

    /**
     * 查询上传文件
     * 
     * @param id 上传文件主键
     * @return 上传文件
     */
    @Override
    public ShippingUpload selectShippingUploadById(Long id)
    {
        return shippingUploadMapper.selectShippingUploadById(id);
    }

    /**
     * 查询上传文件列表
     * 
     * @param shippingUpload 上传文件
     * @return 上传文件
     */
    @Override
    public List<ShippingUpload> selectShippingUploadList(ShippingUpload shippingUpload)
    {
        return shippingUploadMapper.selectShippingUploadList(shippingUpload);
    }

    /**
     * 新增上传文件
     * 
     * @param shippingUpload 上传文件
     * @return 结果
     */
    @Override
    public int insertShippingUpload(ShippingUpload shippingUpload)
    {
        shippingUpload.setCreateTime(DateUtils.getNowDate());
        return shippingUploadMapper.insertShippingUpload(shippingUpload);
    }

    /**
     * 修改上传文件
     * 
     * @param shippingUpload 上传文件
     * @return 结果
     */
    @Override
    public int updateShippingUpload(ShippingUpload shippingUpload)
    {
        return shippingUploadMapper.updateShippingUpload(shippingUpload);
    }

    /**
     * 批量删除上传文件
     * 
     * @param ids 需要删除的上传文件主键
     * @return 结果
     */
    @Override
    public int deleteShippingUploadByIds(Long[] ids)
    {
        return shippingUploadMapper.deleteShippingUploadByIds(ids);
    }

    /**
     * 删除上传文件信息
     * 
     * @param id 上传文件主键
     * @return 结果
     */
    @Override
    public int deleteShippingUploadById(Long id)
    {
        return shippingUploadMapper.deleteShippingUploadById(id);
    }
}
