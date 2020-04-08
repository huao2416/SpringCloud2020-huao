package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import springcloud.entities.Payment;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/3/29 10:15 下午
 */
@Mapper
public interface PaymentDao
{
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);


}
