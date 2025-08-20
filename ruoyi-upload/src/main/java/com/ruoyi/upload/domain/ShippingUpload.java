package com.ruoyi.upload.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 上传文件对象 shipping_upload
 * 
 * @author ruoyi
 * @date 2025-04-10
 */
public class ShippingUpload extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 关联id */
    @Excel(name = "关联id")
    private String relatedId;

    /** 文件名 */
    @Excel(name = "文件名")
    private String fileName;

    /** 原始文件名 */
    @Excel(name = "原始文件名")
    private String originFileName;

    /** 文件地址 */
    @Excel(name = "文件地址")
    private String filePath;

    /** 文件类型 */
    @Excel(name = "文件类型")
    private String fileType;

    /** 上传类型 */
    @Excel(name = "上传类型")
    private String uploadType;


    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRelatedId(String relatedId)
    {
        this.relatedId = relatedId;
    }

    public String getRelatedId()
    {
        return relatedId;
    }
    public void setFileName(String fileName) 
    {
        this.fileName = fileName;
    }

    public String getFileName() 
    {
        return fileName;
    }
    public void setOriginFileName(String originFileName) 
    {
        this.originFileName = originFileName;
    }

    public String getOriginFileName() 
    {
        return originFileName;
    }
    public void setFilePath(String filePath) 
    {
        this.filePath = filePath;
    }

    public String getFilePath() 
    {
        return filePath;
    }
    public void setFileType(String fileType) 
    {
        this.fileType = fileType;
    }

    public String getFileType() 
    {
        return fileType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("relatedId", getRelatedId())
            .append("fileName", getFileName())
            .append("originFileName", getOriginFileName())
            .append("filePath", getFilePath())
            .append("fileType", getFileType())
            .append("createBy", getCreateBy())
            .append("uploadType", getUploadType())
            .append("createTime", getCreateTime())
            .toString();
    }
}
