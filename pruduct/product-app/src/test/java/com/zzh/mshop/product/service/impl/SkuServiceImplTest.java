package com.zzh.mshop.product.service.impl;

import com.zzh.mshop.product.ProductApplicationTest;
import com.zzh.mshop.product.entity.Sku;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author zzh
 * @date 2019/5/1
 */
public class SkuServiceImplTest extends ProductApplicationTest {


    @Autowired
    private SkuServiceImpl skuService;


    @Test
    public void testfindById(){
        Sku byId = skuService.getById(2600242);
        System.out.println(byId);
    }
}