package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
        System.out.println("(♥◠‿◠)ﾉﾞ  订单模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "     _______.___________.    ___      .______          _______.  ______   \n" +
                "    /       |           |   /   \\     |   _  \\        /       | /  __  \\  \n" +
                "   |   (----`---|  |----`  /  ^  \\    |  |_)  |      |   (----`|  |  |  | \n" +
                "    \\   \\       |  |      /  /_\\  \\   |      /        \\   \\    |  |  |  | \n" +
                ".----)   |      |  |     /  _____  \\  |  |\\  \\----.----)   |   |  `--'  | \n" +
                "|_______/       |__|    /__/     \\__\\ | _| `._____|_______/     \\______/  \n"
        );
    }

}
