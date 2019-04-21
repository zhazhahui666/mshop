package com.zzh.mshop.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzh
 * @date 2019/4/5
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String getMsg() {
        return "this is msg";
    }
}
