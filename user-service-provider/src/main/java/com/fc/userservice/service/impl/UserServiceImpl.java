package com.fc.userservice.service.impl;

import com.fc.gmall.bean.UserAddress;
import com.fc.gmall.service.IUserService;

import java.util.Arrays;
import java.util.List;

/**
 * UserServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 上午 10:09:28 2020/3/10/0010
 */
public class UserServiceImpl implements IUserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "上海市", "1", "Fc", "176", "Y");
        UserAddress address2 = new UserAddress(1, "北京市", "1", "Kc", "178", "N");
        return Arrays.asList(address1, address2);
    }
}
