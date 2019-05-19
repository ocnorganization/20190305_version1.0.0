/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.mapper;



import com.alexmillerning.pojo.WFBrand;
import com.alexmillerning.pojo.WFBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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