package com.zzh.mshop.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzh.mshop.product.entity.Sku;
import com.zzh.mshop.product.mapper.SkuMapper;
import com.zzh.mshop.product.service.SkuService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * sku表,该表表示具体的商品实体,如黑色的 64g的iphone 8 服务实现类
 * </p>
 *
 * @author zzh
 * @since 2019-05-01
 */
@Service
public class SkuServiceImpl extends ServiceImpl<SkuMapper, Sku> implements SkuService {


}
