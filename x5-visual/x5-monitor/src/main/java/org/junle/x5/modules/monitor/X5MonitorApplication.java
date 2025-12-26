package org.junle.x5.modules.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 * 
 * @author elnujuw
 */
@EnableAdminServer
@SpringBootApplication
public class X5MonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(X5MonitorApplication.class, args);
        System.out.println("X5监控中心启动成功");
    }
}
