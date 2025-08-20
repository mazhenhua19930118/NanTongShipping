package com.ruoyi.common.enums;

/**
 * @author mzh
 */

public enum FileType {
    /**
     * 枚举
     */
    IMG("img", "图片"),
    VIDEO("video", "视频"),
    EXCEL("excel", "表格"),
    TEXT("text", "文本");

    private String code;
    private String desc;

    FileType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
