package com.ssk.generatetable;

import com.gitee.sunchenbin.mybatis.actable.manager.handler.StartUpHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.gitee.sunchenbin.mybatis.actable.dao.*")
@ComponentScan(basePackages = {"com.gitee.sunchenbin.mybatis.actable.manager.*"})
public class GenerateTableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(GenerateTableApplication.class, args);

        // 容器中获取actable的核心处理类
        StartUpHandler bean =run.getBean(StartUpHandler.class, args);
        // 手动执行actable的建表方法
        bean.startHandler();
    }

}
