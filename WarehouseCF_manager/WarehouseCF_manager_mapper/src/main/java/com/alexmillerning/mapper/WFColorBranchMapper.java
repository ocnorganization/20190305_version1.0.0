package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFColorBranch;
import com.alexmillerning.pojo.WFColorBranchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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