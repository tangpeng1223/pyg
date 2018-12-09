package com.pingyougou.service.inter;

import com.pingyougou.pojo.TbBrand;

import java.util.List;

/**
 * 品牌接口
 */
public interface BrandService {

    /**
     * 查询所有的品牌
     * @return
     */
    List<TbBrand> findAll();
}
