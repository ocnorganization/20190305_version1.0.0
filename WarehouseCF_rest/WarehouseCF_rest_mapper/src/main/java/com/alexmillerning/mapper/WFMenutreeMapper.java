package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFMenutree;
import com.alexmillerning.pojo.WFMenutreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WFMenutreeMapper {
    int countByExample(WFMenutreeExample example);

    int deleteByExample(WFMenutreeExample example);

    int deleteByPrimaryKey(String menuid);

    int insert(WFMenutree record);

    int insertSelective(WFMenutree record);

    List<WFMenutree> selectByExample(WFMenutreeExample example);

    WFMenutree selectByPrimaryKey(String menuid);

    int updateByExampleSelective(@Param("record") WFMenutree record, @Param("example") WFMenutreeExample example);

    int updateByExample(@Param("record") WFMenutree record, @Param("example") WFMenutreeExample example);

    int updateByPrimaryKeySelective(WFMenutree record);

    int updateByPrimaryKey(WFMenutree record);
}