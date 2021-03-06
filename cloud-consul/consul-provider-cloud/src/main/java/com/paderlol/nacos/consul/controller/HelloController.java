package com.paderlol.nacos.consul.controller;

import com.paderlol.nacos.consul.ConsulProviderApplication.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author paderlol
 * @date: 2019-04-06 18:08
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {

        return "Hello World from Consul!";
    }

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/nacos-hello")
    public String hello2() {
        return helloService.hello();
    }

}
