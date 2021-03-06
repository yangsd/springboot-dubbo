package com;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author sdyang
 * @create 2018-02-01 09:55
 */
@SpringBootApplication
@EnableDubboConfiguration
public class SpringBootStart extends SpringBootServletInitializer {

    private static Logger logger = LoggerFactory.getLogger(SpringBootStart.class);

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(SpringBootStart.class);
    }

    public static void main(String[] args) {
        logger.info("==============  ***  开始启动 Dubbo Provider ***  ==============");
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootStart.class, args);
        logger.info("==============  ***  Dubbo Provider 启动完成  ***  ==============");
    }
}
