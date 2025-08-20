package com.ruoyi.upload.service;

import java.util.List;
import com.ruoyi.upload.domain.ShippingUpload;

/**
 * 上传文件Service接口
 * 
 * @author ruoyi
 * @date 2025-04-10
 */
public interface IShippingUploadService 
{
    /**
     * 查询上传文件
     * 
     * @param id 上传文件主键
     * @return 上传文件
     */
    public ShippingUpload selectShippingUploadById(Long id);

    /**
     * 查询上传文件列表
     * 
     * @param shippingUpload 上传文件
     * @return 上传文件集合
     */
    public List<ShippingUpload> selectShippingUploadList(ShippingUpload shippingUpload);

    /**
     * 新增上传文件
     * 
     * @param shippingUpload 上传文件
     * @return 结果
     */
    public int insertShippingUpload(ShippingUpload shippingUpload);

    /**
     * 修改上传文件
     * 
     * @param shippingUpload 上传文件
     * @return 结果
     */
    public int updateShippingUpload(ShippingUpload shippingUpload);

    /**
     * 批量删除上传文件
     * 
     * @param ids 需要删除的上传文件主键集合
     * @return 结果
     */
    public int deleteShippingUploadByIds(Long[] ids);

    /**
     * 删除上传文件信息
     * 
     * @param id 上传文件主键
     * @return 结果
     */
    public int deleteShippingUploadById(Long id);
}
