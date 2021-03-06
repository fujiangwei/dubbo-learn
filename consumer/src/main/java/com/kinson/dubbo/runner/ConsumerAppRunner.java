package com.kinson.dubbo.runner;

import com.kinson.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * descripiton:
 *
 * @author: kinson(2219945910@qq.com)
 * @date: 2019/4/12
 * @time: 15:25
 * @modifier:
 * @since:
 */
@Component
public class ConsumerAppRunner implements ApplicationRunner {

    @Autowired
    private DemoService demoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("*******************************");
        System.out.println("consumer 启动成功");
        System.out.println("*******************************");
        System.out.println(demoService.testService());
    }
}
