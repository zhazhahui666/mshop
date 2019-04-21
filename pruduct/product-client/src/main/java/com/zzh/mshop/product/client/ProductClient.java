package com.zzh.mshop.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zzh
 * @date 2019/4/5
 */
@FeignClient("product")
public interface ProductClient {

    @GetMapping("test")
    String getMsg();
}
