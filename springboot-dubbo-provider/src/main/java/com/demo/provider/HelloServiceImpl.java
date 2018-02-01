package com.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.api.IHelloService;
import org.springframework.stereotype.Component;

/**
 * @author sdyang
 * @create 2018-02-01 10:07
 **/
@Component
@Service(interfaceClass = IHelloService.class)
public class HelloServiceImpl implements IHelloService {
    @Override
    public String say(String name) {
        return String.format("Hello %s !",name);
    }
}
