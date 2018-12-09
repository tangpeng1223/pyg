package com.pingyougou.mapper;

import com.pingyougou.pojo.TbBrand;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 品牌持久层
 */

public interface BrandMapper {
    /**
     * 查询所有的品牌
     * @return
     */
    List<TbBrand> findAll();
}
