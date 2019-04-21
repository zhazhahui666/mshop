package com.zzh.mshop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzh
 * @date 2019/4/5
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.zzh.mshop")
//@EnableFeignClients
@RestController
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }


    @GetMapping("/xixi")
    public String getMsg(){
        return "11111111111";
    }
}
