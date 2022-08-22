package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GatewaryApplication {

    public static void main(String[] args) {
        System.out.println("(♥◠‿◠)ﾉﾞ  网关启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "     _______.___________.    ___      .______          _______.  ______   \n" +
                "    /       |           |   /   \\     |   _  \\        /       | /  __  \\  \n" +
                "   |   (----`---|  |----`  /  ^  \\    |  |_)  |      |   (----`|  |  |  | \n" +
                "    \\   \\       |  |      /  /_\\  \\   |      /        \\   \\    |  |  |  | \n" +
                ".----)   |      |  |     /  _____  \\  |  |\\  \\----.----)   |   |  `--'  | \n" +
                "|_______/       |__|    /__/     \\__\\ | _| `._____|_______/     \\______/  \n" +
                "                                                                          ");
        SpringApplication.run(GatewaryApplication.class,args);
    }

}
