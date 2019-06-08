/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.mapper;



import com.alexmillerning.pojo.WFMenus;
import com.alexmillerning.pojo.WFMenusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WFMenusMapper {
    int countByExample(WFMenusExample example);

    int deleteByExample(WFMenusExample example);

    int deleteByPrimaryKey(String menuid);

    int insert(WFMenus record);

    int insertSelective(WFMenus record);

    List<WFMenus> selectByExample(WFMenusExample example);

    WFMenus selectByPrimaryKey(String menuid);

    int updateByExampleSelective(@Param("record") WFMenus record, @Param("example") WFMenusExample example);

    int updateByExample(@Param("record") WFMenus record, @Param("example") WFMenusExample example);

    int updateByPrimaryKeySelective(WFMenus record);

    int updateByPrimaryKey(WFMenus record);
}