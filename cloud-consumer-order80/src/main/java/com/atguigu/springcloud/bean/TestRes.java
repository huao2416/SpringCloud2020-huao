package com.atguigu.springcloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/4/8 10:17 上午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestRes
{
    private String code;
    private String message;
    private List<VmsVehicleMsg> result;
}
