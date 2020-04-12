package com.luheng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("/providerMethod")
    public void providerMethod(){
        System.out.println("服务提供者被调用");
    }
}
