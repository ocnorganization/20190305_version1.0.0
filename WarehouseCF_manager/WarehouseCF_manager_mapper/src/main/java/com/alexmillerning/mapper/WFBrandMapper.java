package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFBrand;
import com.alexmillerning.pojo.WFBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WFBrandMapper {
    //分页查询
    List<WFBrand> selectByExampleandPage(WFBrandExample example);

    int countByExample(WFBrandExample example);

    int deleteByExample(WFBrandExample example);

    int deleteByPrimaryKey(Integer brandId);

    int insert(WFBrand record);

    int insertSelective(WFBrand record);

    List<WFBrand> selectByExample(WFBrandExample example);

    WFBrand selectByPrimaryKey(Integer brandId);

    int updateByExampleSelective(@Param("record") WFBrand record, @Param("example") WFBrandExample example);

    int updateByExample(@Param("record") WFBrand record, @Param("example") WFBrandExample example);

    int updateByPrimaryKeySelective(WFBrand record);

    int updateByPrimaryKey(WFBrand record);
}