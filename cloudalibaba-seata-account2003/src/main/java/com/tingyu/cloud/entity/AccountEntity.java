package com.tingyu.cloud.entity;

import lombok.Data;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 17:36
 **/
@Data
public class AccountEntity {

    private long id;
    private long userid;
    private double total;
    private double used;
    private double rest;

}
