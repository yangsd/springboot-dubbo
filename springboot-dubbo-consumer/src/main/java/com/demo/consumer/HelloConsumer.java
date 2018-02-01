package com.demo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.api.IHelloService;
import org.springframework.stereotype.Component;

/**
 * @author sdyang
 * @create 2018-02-01 10:17
 **/
@Component
public class HelloConsumer {

    @Reference
    private IHelloService iHelloService;

    public void SayHello(){
        System.out.println(iHelloService.say("Dubbo"));
    }
}
