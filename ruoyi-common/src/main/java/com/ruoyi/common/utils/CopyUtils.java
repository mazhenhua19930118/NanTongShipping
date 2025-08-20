package com.ruoyi.common.utils;

import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @author mzh
 */
public class CopyUtils {
    /**
     * 对象拷贝工具方法，忽略id属性，为null的属性也拷贝
     *
     * @param source 源对象
     * @param target 目标对象
     */
    public static void copyProperties(Object source, Object target) {
        if (source == null || target == null) {
            throw new IllegalArgumentException("Source and target objects cannot be null");
        }

        // 获取源对象和目标对象的所有属性
        PropertyDescriptor[] sourcePds = BeanUtils.getPropertyDescriptors(source.getClass());
        PropertyDescriptor[] targetPds = BeanUtils.getPropertyDescriptors(target.getClass());

        // 遍历源对象的属性
        for (PropertyDescriptor sourcePd : sourcePds) {
            String sourcePropertyName = sourcePd.getName();
            Method readMethod = sourcePd.getReadMethod();

            // 跳过id字段
            if ("id".equals(sourcePropertyName) || readMethod == null) {
                continue;
            }

            // 查找目标对象中是否存在同名属性
            for (PropertyDescriptor targetPd : targetPds) {
                String targetPropertyName = targetPd.getName();
                Method writeMethod = targetPd.getWriteMethod();

                if (sourcePropertyName.equals(targetPropertyName) && writeMethod != null) {
                    try {
                        // 获取源对象属性值
                        Object value = readMethod.invoke(source);
                        // 设置目标对象属性值
                        writeMethod.invoke(target, value);
                    } catch (Exception e) {
                        // 忽略异常，继续处理下一个属性
                    }
                }
            }
        }
    }


}
