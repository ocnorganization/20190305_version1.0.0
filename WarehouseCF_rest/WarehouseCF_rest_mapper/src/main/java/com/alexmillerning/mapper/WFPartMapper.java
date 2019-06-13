package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFPart;
import com.alexmillerning.pojo.WFPartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WFPartMapper {
    int countByExample(WFPartExample example);

    int deleteByExample(WFPartExample example);

    int deleteByPrimaryKey(Integer partId);

    int insert(WFPart record);

    int insertSelective(WFPart record);

    List<WFPart> selectByExample(WFPartExample example);

    WFPart selectByPrimaryKey(Integer partId);

    int updateByExampleSelective(@Param("record") WFPart record, @Param("example") WFPartExample example);

    int updateByExample(@Param("record") WFPart record, @Param("example") WFPartExample example);

    int updateByPrimaryKeySelective(WFPart record);

    int updateByPrimaryKey(WFPart record);
}