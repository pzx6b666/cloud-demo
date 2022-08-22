package com;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * tongbu
 */
@Component
public class RemoteSyncFallbackFactory implements FallbackFactory<RemoteSyncService> {

    private static final Logger log = LoggerFactory.getLogger(RemoteSyncFallbackFactory.class);

    @Override
    public RemoteSyncService create(Throwable throwable) {

        log.error("订单调用失败:{}", throwable.getMessage());

        return new RemoteSyncService() {
            @Override
            public String getOrder(String userId) {
                return "调用订单接口失败";
            }
        };
    }
}
