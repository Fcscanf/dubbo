package com.fc.gmall.service;

/**
 * OrderService
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 上午 10:37:06 2020/3/10/0010
 */
public interface IOrderService {

    /**
     * 初始化订单
     * @param userId
     */
    void initOrder(String userId);
}
