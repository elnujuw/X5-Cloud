package org.junle.x5.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junle.x5.common.security.annotation.EnableCustomConfig;
import org.junle.x5.common.security.annotation.EnableRyFeignClients;

/**
 * 定时任务
 * 
 * @author elnujuw
 */
@EnableCustomConfig
@EnableRyFeignClients   
@SpringBootApplication
public class X5JobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(X5JobApplication.class, args);
        System.out.println("X5定时任务模块启动成功!");
    }
}
