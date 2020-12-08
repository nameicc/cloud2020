package com.tingyu.cloud.entity;

import lombok.Data;

/**
 * @Description
 * @Author tingyu
 * @Date 2020/12/8 17:19
 **/
@Data
public class StorageEntity {

    private long id;
    private long productid;
    private long total;
    private long used;
    private long rest;

}
