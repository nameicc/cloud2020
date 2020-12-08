package com.tinyu.cloud.entity;

import lombok.Data;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 16:40
 **/
@Data
public class OrderEntity {

    private long id;
    private long userid;
    private long productid;
    private long amount;
    private double money;

}
