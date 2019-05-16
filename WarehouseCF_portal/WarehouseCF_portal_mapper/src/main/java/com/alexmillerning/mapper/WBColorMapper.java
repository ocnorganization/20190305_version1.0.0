/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WBColor;
import com.alexmillerning.pojo.WBColorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WBColorMapper {
    int countByExample(WBColorExample example);

    int deleteByExample(WBColorExample example);

    int deleteByPrimaryKey(String colorId);

    int insert(WBColor record);

    int insertSelective(WBColor record);

    List<WBColor> selectByExample(WBColorExample example);

    WBColor selectByPrimaryKey(String colorId);

    int updateByExampleSelective(@Param("record") WBColor record, @Param("example") WBColorExample example);

    int updateByExample(@Param("record") WBColor record, @Param("example") WBColorExample example);

    int updateByPrimaryKeySelective(WBColor record);

    int updateByPrimaryKey(WBColor record);
}