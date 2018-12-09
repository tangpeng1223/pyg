package com.pingyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pingyougou.mapper.BrandMapper;
import com.pingyougou.pojo.TbBrand;
import com.pingyougou.service.inter.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 查询所有的品牌
     *
     * @return
     */
    @Override
    public List<TbBrand> findAll() {
        return brandMapper.findAll();
    }
}
