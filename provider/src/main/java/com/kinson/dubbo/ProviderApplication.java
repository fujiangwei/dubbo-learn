package com.kinson.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class ProviderApplication {
    /**
     * 核心启动类
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}