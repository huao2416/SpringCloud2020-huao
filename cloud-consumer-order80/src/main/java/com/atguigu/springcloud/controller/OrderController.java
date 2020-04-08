package com.atguigu.springcloud.controller;

import cn.hutool.json.JSON;
import com.atguigu.springcloud.bean.SyncVehicleRequest;
import com.atguigu.springcloud.bean.TestReq;
import com.atguigu.springcloud.bean.TestRes;
import com.atguigu.springcloud.bean.VmsVehicleMsg;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import springcloud.entities.CommonResult;
import springcloud.entities.Payment;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/4/6 11:54 上午
 */
@RestController
public class OrderController
{
    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> creat(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    @PostMapping(value = "/fota/getCarMessageList")
    public TestRes getCarMessageList(@RequestBody  TestReq req){
        return restTemplate.postForObject("http://221.192.228.244:28001/gwmNEWVMSServer/fota/getCarMessageList",req,
                TestRes.class);
    }

    }
