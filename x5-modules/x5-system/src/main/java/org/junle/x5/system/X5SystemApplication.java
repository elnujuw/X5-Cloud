package org.junle.x5.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junle.x5.common.security.annotation.EnableCustomConfig;
import org.junle.x5.common.security.annotation.EnableRyFeignClients;

/**
 * 系统模块
 * 
 * @author elnujuw
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class X5SystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(X5SystemApplication.class, args);
        System.out.println("X5系统模块启动成功");
    }
}
