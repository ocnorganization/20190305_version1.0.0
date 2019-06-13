package com.alexmillerning.mapper;

import com.alexmillerning.pojo.WFSeason;
import com.alexmillerning.pojo.WFSeasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WFSeasonMapper {
    int countByExample(WFSeasonExample example);

    int deleteByExample(WFSeasonExample example);

    int deleteByPrimaryKey(Integer seasonId);

    int insert(WFSeason record);

    int insertSelective(WFSeason record);

    List<WFSeason> selectByExample(WFSeasonExample example);

    WFSeason selectByPrimaryKey(Integer seasonId);

    int updateByExampleSelective(@Param("record") WFSeason record, @Param("example") WFSeasonExample example);

    int updateByExample(@Param("record") WFSeason record, @Param("example") WFSeasonExample example);

    int updateByPrimaryKeySelective(WFSeason record);

    int updateByPrimaryKey(WFSeason record);
}