package com.mzt.logapi.starter.annotation;

import java.lang.annotation.*;

/**
 * @author muzhantong
 * create on 2020/4/29 3:22 下午
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface LogRecord {
    /**
     * 方法执行成功后的日志模版
     */
    String success();

    /**
     * 方法执行失败后的日志模版
     */
    String fail() default "";

    /**
     * 日志的操作人
     */
    String operator() default "";

    /**
     * 操作日志的类型，比如：订单类型、商品类型
     */
    String type();

    /**
     * 子业务模型的id
     */
    String subBizNo() default "";

    /**
     * 业务模型的id
     */
    String bizNo();

    /**
     * 日志的额外信息
     */
    String extra() default "";

    String condition() default "";

    /**
     * 是否是批量操作，这个功能未测试，可能有bug.
     * 3.0.0版本移除了这个功能.
     */
    @Deprecated
    boolean isBatch() default false;

    /**
     * 操作类型，比如：增、删、改，可自定义枚举，便于查询某种操作类型的日志
     */
    String actionType() default "";

    /**
     * 详细日志
     */
    String detail() default "";
}
