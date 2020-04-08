package com.atguigu.springcloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/4/8 9:23 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SyncVehicleRequest
{

    private String beginNumber;
    /**
     * 查询笔数   要返回的数据条数
     */
    private String queryNumber;
}