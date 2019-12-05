package com.xuling.consumerdemo.controller;

import com.xuling.consumerdemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/getService")
    public String callService(String info){
        return testService.callService(info);
    }
}
