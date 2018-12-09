package test;

import com.pingyougou.mapper.BrandMapper;
import com.pingyougou.pojo.TbBrand;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestMapper {

    @Autowired
    private BrandMapper brandMapper;

    @Test
    public void testMappers(){
        List<TbBrand> brandList = brandMapper.findAll();
        for (TbBrand brand:brandList){
            System.out.println(brand.getName());
        }

    }
}
