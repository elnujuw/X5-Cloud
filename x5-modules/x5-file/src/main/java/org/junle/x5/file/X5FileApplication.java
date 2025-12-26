package org.junle.x5.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 文件服务
 * 
 * @author elnujuw
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class X5FileApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(X5FileApplication.class, args);
        System.out.println("X5文件服务模块启动成功!");
    }
}
