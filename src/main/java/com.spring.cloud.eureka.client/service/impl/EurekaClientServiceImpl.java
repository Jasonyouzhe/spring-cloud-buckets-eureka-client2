package com.spring.cloud.eureka.client.service.impl;

import com.spring.cloud.eureka.client.feign.EkaFeignService;
import com.spring.cloud.eureka.client.service.EurekaClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EurekaClientServiceImpl implements EurekaClientService {
    @Autowired
    EkaFeignService ekaFeignService;
    @Override
    public String test(String name) {
        return ekaFeignService.test(name);
    }

}
