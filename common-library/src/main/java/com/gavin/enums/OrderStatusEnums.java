package com.gavin.enums;

/**
 * 订单状态枚举
 */
public enum OrderStatusEnums {

    ERROR, //失败
    CREATED, //创建
    RESERVED, //订单中的商品已预约
    CANCELED, //取消
    EXPIRED, //过期作废
    PAYING, //等待支付
    PAID, //支付成功
    SHIPPED, //发货
    DELIVERED, //已送达
    COMPLETED //完成

}
