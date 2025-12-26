package org.junle.x5.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junle.x5.common.security.annotation.EnableCustomConfig;
import org.junle.x5.common.security.annotation.EnableRyFeignClients;

/**
 * 代码生成
 * 
 * @author elnujuw
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class X5GenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(X5GenApplication.class, args);
        System.out.println("X5代码生成模块启动成功!");
    }
}
