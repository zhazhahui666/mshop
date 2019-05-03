package com.zzh.mshop.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzh.mshop.product.entity.Spu;
import com.zzh.mshop.product.mapper.SpuMapper;
import com.zzh.mshop.product.service.SpuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * spu表，该表描述的是一个抽象性的商品，比如 iphone8 服务实现类
 * </p>
 *
 * @author zzh
 * @since 2019-05-01
 */
@Service
public class SpuServiceImpl extends ServiceImpl<SpuMapper, Spu> implements SpuService {

}
