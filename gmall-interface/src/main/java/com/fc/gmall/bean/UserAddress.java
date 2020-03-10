package com.fc.gmall.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * UserAddress
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 上午 10:03:36 2020/3/10/0010
 */
@Data
public class UserAddress implements Serializable {

    private Integer id;
    /**
     * 用户地址
     */
    private String userAddress;
    /**
     * 用户id
     */
    private String userID;
    /**
     * 收货人
     */
    private String consignee;
    /**
     * 电话号码
     */
    private String phoneNum;
    /**
     * 是否为默认地址 Y-是 N-否
     */
    private String isDefault;

    public UserAddress(Integer id, String userAddress, String userID, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userID = userID;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }
}
