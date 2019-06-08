/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.mapper;



import com.alexmillerning.pojo.WFColorBranch;
import com.alexmillerning.pojo.WFColorBranchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WFColorBranchMapper {
    /**
     * 添加分页查询
     * @param example
     * @return
     */
    List<WFColorBranch> selectByExampleandPage(WFColorBranchExample example);

    //添加联合查询
    List<WFColorBranch> selectByUnion(WFColorBranchExample example);
    int countByExample(WFColorBranchExample example);

    int deleteByExample(WFColorBranchExample example);

    int deleteByPrimaryKey(Integer colorBranchId);

    int insert(WFColorBranch record);

    int insertSelective(WFColorBranch record);

    List<WFColorBranch> selectByExample(WFColorBranchExample example);

    WFColorBranch selectByPrimaryKey(Integer colorBranchId);

    int updateByExampleSelective(@Param("record") WFColorBranch record, @Param("example") WFColorBranchExample example);

    int updateByExample(@Param("record") WFColorBranch record, @Param("example") WFColorBranchExample example);

    int updateByPrimaryKeySelective(WFColorBranch record);

    int updateByPrimaryKey(WFColorBranch record);
}