/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFSizeBranch;
import com.alexmillerning.pojo.WFSizeBranchExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WFSizeBranchMapper {
    List<WFSizeBranch> selectByUnion(WFSizeBranchExample example);

    int countByExample(WFSizeBranchExample example);

    int deleteByExample(WFSizeBranchExample example);

    int deleteByPrimaryKey(Integer sizeBranchId);

    int insert(WFSizeBranch record);

    int insertSelective(WFSizeBranch record);

    List<WFSizeBranch> selectByExample(WFSizeBranchExample example);

    WFSizeBranch selectByPrimaryKey(Integer sizeBranchId);

    int updateByExampleSelective(@Param("record") WFSizeBranch record, @Param("example") WFSizeBranchExample example);

    int updateByExample(@Param("record") WFSizeBranch record, @Param("example") WFSizeBranchExample example);

    int updateByPrimaryKeySelective(WFSizeBranch record);

    int updateByPrimaryKey(WFSizeBranch record);
}