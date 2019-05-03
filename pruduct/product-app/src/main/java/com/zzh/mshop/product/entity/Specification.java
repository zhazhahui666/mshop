package com.zzh.mshop.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品规格参数模板，json格式。
 * </p>
 *
 * @author zzh
 * @since 2019-05-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_specification")
public class Specification implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 规格模板所属商品分类id
     */
    private Long categoryId;

    /**
     * 规格参数模板，json格式
     */
    private String specifications;


}
