package com.luheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/consumerMethod")
    public void consumerMethod(){
        restTemplate.getForEntity("http://eureka-provider/providerMethod",String.class);
    }
}
