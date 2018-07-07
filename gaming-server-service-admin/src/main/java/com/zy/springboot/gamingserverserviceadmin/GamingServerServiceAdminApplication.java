package com.zy.springboot.gamingserverserviceadmin;

import org.springframework.boot.SpringApplication;
import com.alibaba.dubbo.container.Main;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
@SpringBootApplication
@MapperScan(basePackages = "com.zy.springboot.gamingserverserviceadmin")
public class GamingServerServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamingServerServiceAdminApplication.class, args);
        Main.main(args);
    }
}
