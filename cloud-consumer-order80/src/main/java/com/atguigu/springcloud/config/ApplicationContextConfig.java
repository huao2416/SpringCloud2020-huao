package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Hugh.Hu
 * @Date: 2020/4/6 11:59 上午
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
