package com.ruoyi.common.enums;

import com.ruoyi.common.utils.StringUtils;

/**
 * @author mzh
 */

public enum TaskStatus {
    /**
     * 创建
     */
    create("1001", "已创建","创建了货源订单"),
    publish("1002", "已发布","发布了货源订单"),
    dispatch("1003", "已派单","派送了货源订单"),
    sign_main_contract("1004", "主合同已签订","签订了主合同"),
    pre_insurance("1005", "已预保险","上了预保险"),
    termination("1006", "已终止","终止了任务"),
    loading("1007", "已装货","填报了装货数据"),
    insurance("1008", "已确认保险","确认了保险"),
    sign_sub_contract("1009", "子合同已签订","签订了子合同"),
    advance_payment("1010", "预付款","进行了预保险"),
    unloaded("1011", "已卸货","确认了卸货"),
    upload_details("1012", "已上传卸货明细","上传了卸货明细"),
    paid("1013", "已支付","支付了运费"),
    already_settled("1014", "已结算","结算了运费");

    private String code;
    private String desc;
    private String remark;

    TaskStatus(String code, String desc, String remark) {
        this.code = code;
        this.desc = desc;
        this.remark = remark;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public String getRemark() {
        return remark;
    }

    public static String transferRemark(String code){
        for(TaskStatus task :TaskStatus.values()){
            if(StringUtils.equals(code,task.getCode())){
                return task.remark;
            }
        }
        return "";
    }

    public static String getDescByCode(String code) {
        for (TaskStatus task : TaskStatus.values()) {
            if (StringUtils.equals(code, task.getCode())) {
                return task.desc;
            }
        }
        return "";
    }
}
