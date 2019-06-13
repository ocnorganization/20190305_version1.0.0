package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFCraft;
import com.alexmillerning.pojo.WFCraftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WFCraftMapper {
    int countByExample(WFCraftExample example);

    int deleteByExample(WFCraftExample example);

    int deleteByPrimaryKey(Integer craftId);

    int insert(WFCraft record);

    int insertSelective(WFCraft record);

    List<WFCraft> selectByExample(WFCraftExample example);

    WFCraft selectByPrimaryKey(Integer craftId);

    int updateByExampleSelective(@Param("record") WFCraft record, @Param("example") WFCraftExample example);

    int updateByExample(@Param("record") WFCraft record, @Param("example") WFCraftExample example);

    int updateByPrimaryKeySelective(WFCraft record);

    int updateByPrimaryKey(WFCraft record);
}