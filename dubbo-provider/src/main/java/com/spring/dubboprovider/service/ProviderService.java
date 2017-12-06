package com.spring.dubboprovider.service;

import com.springboot.dubboapi.RpcService;

public class ProviderService implements RpcService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
