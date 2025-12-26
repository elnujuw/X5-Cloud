package org.junle.x5.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author elnujuw
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class X5GatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(X5GatewayApplication.class, args);
        System.out.println("X5网关启动成功!");
    }
}
