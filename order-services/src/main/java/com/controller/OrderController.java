package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@RequestMapping(value ="/order")
@RestController
public class OrderController {


    @RequestMapping(value = "/getOrder")
    public String getOrder() {
        /**
         * 测试分支22222
         */

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = requestAttributes.getRequest();

        String localAddr = request.getLocalAddr();

        int serverPort = request.getServerPort();

        return "http://"+localAddr +":"+ serverPort;
    }

}
