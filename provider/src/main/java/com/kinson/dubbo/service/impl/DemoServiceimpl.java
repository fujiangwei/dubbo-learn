package com.kinson.dubbo.service.impl;

import com.kinson.dubbo.service.DemoService;

public class DemoServiceimpl implements DemoService {
    @Override
    public String testService() {
        return "provider testService";
    }
}