package com.springboot.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubboapi.RpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class ConsumerController {

    @Reference
    private RpcService rpcService;

    @ResponseBody
    @PostMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name){
        return rpcService.sayHello(name);
    }
}
