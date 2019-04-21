package com.zzh.mshop.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zzh
 * @date 2019/4/5
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductAppication {
    public static void main(String[] args) {
        SpringApplication.run(ProductAppication.class, args);
    }
}
