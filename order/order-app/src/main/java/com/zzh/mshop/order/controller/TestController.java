package com.zzh.mshop.order.controller;

import com.zzh.mshop.product.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzh
 * @date 2019/4/5
 */
@RestController
public class TestController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("msg")
    public String getMsg(){
        String msg = productClient.getMsg();
        System.out.println(msg);
        return msg;
    }
}
