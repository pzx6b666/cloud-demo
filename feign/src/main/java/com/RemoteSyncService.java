package com;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(contextId = "remoteSyncService", value ="order-service",fallbackFactory = RemoteSyncFallbackFactory.class,path = "/order")
public interface RemoteSyncService {
    @GetMapping("/getOrder")
    String getOrder(String userId);

}
