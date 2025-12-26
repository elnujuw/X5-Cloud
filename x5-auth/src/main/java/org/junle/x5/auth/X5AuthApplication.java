package org.junle.x5.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.junle.x5.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author elnujuw
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class X5AuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(X5AuthApplication.class, args);
        System.out.println("X5认证授权中心启动成功!");
    }
}
