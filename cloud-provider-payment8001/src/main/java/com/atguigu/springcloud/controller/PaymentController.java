package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import springcloud.entities.CommonResult;
import springcloud.entities.Payment;

import java.util.List;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/4/5 12:21 下午
 */
@RestController
@Slf4j
public class PaymentController
{
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果："+payment);
        if(payment != null){
            return new CommonResult(200,"查询成功,serverPort："+serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID："+id,null);
        }
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****huao插入结果："+result);
        if(result > 0){
            return new CommonResult(200,"插入数据成功,serverPort："+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据失败",null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services)
        {
            log.error("SpringCloud--service:{}",service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-SERVICE");
        for (ServiceInstance instance : instances)
        {
            log.error(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

}
