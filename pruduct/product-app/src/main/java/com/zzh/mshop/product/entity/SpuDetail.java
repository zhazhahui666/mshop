package com.zzh.mshop.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzh
 * @since 2019-05-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_spu_detail")
public class SpuDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long spuId;

    /**
     * 商品描述信息
     */
    private String description;

    /**
     * 全部规格参数数据
     */
    private String specifications;

    /**
     * 特有规格参数及可选值信息，json格式
     */
    private String specTemplate;

    /**
     * 包装清单
     */
    private String packingList;

    /**
     * 售后服务
     */
    private String afterService;


}
