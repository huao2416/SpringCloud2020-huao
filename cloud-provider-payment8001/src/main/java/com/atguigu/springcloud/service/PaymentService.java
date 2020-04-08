package com.atguigu.springcloud.service;

import springcloud.entities.Payment;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/4/5 12:10 下午
 */
public interface PaymentService
{
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
