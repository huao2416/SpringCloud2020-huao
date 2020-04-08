package com.atguigu.springcloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/4/8 9:28 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestReq
{
    private String appKey;
    private String timeStamp;
    private String sign;
    private SyncVehicleRequest data;
}
