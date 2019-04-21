package com.zzh.mshop.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zzh
 * @date 2019/4/5
 */
@FeignClient(name = "product")
public interface ProductClient {

    @GetMapping("test")
    String getMsg();
}
