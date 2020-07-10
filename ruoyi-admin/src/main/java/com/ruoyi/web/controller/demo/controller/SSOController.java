package com.ruoyi.web.controller.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSOController {
    //     @Value("${wayn.ssoServerUrl}")
    @Value("${ssoServiceUrl}")
    private String url;
    @RequestMapping("sos")
    public Object demo1(){
        return url;
    }
}
