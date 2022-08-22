package com;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan(value = "com.dao")
public class UserApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(UserApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  用户模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "     _______.___________.    ___      .______          _______.  ______   \n" +
                "    /       |           |   /   \\     |   _  \\        /       | /  __  \\  \n" +
                "   |   (----`---|  |----`  /  ^  \\    |  |_)  |      |   (----`|  |  |  | \n" +
                "    \\   \\       |  |      /  /_\\  \\   |      /        \\   \\    |  |  |  | \n" +
                ".----)   |      |  |     /  _____  \\  |  |\\  \\----.----)   |   |  `--'  | \n" +
                "|_______/       |__|    /__/     \\__\\ | _| `._____|_______/     \\______/  \n" +
                "                                                                          ");
    }
}
