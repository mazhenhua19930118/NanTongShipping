package com.ruoyi.common.vo;

import com.ruoyi.common.annotation.Excel;

/**
 * @author mzh
 */
public class ShippingUploadVo {
    /** 序号 */
    private Long id;

    /** 关联id */
    @Excel(name = "关联id")
    private Long relatedId;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(Long relatedId) {
        this.relatedId = relatedId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getOriginFileName() {
        return originFileName;
    }

    public void setOriginFileName(String originFileName) {
        this.originFileName = originFileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType;
    }
}
