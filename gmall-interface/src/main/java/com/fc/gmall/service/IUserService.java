package com.fc.gmall.service;

import com.fc.gmall.bean.UserAddress;

import java.util.List;

/**
 * IUserService
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 上午 10:07:30 2020/3/10/0010
 */
public interface IUserService {

    /**
     * 根据用户ID获取用户地址
     *
     * @param userId 用户ID
     * @author Fcant 上午 10:09:02 2020/3/10/0010
     */
    List<UserAddress> getUserAddressList(String userId);
}
